import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Vector;

public class MarkovTextGenerator {

    private static final int DEFAULT_ORDER = 2; // default order for the Markov chain
    private final int order; // the order of the Markov chain
    private final Map<String, Vector<String>> map; // the map that stores the Markov chain

    public MarkovTextGenerator() {
        this(DEFAULT_ORDER);
    }

    public MarkovTextGenerator(int order) {
        this.order = order;
        this.map = new HashMap<>();
    }

    public void train(String text) {
        String[] words = text.split("\\s+");
        for (int i = 0; i < words.length - order; i++) {
            String key = getKey(words, i);
            String value = words[i + order];
            map.putIfAbsent(key, new Vector<>());
            map.get(key).add(value);
        }
    }

    public String generate(int length) {
        Random random = new Random();
        int index = random.nextInt(map.size());
        String[] keys = map.keySet().toArray(new String[map.size()]);
        String key = keys[index];
        StringBuilder sb = new StringBuilder(key);
        for (int i = 0; i < length - order; i++) {
            Vector<String> values = map.get(key);
            if (values == null || values.isEmpty()) {
                break;
            }
            String value = values.get(random.nextInt(values.size()));
            sb.append(" ").append(value);
            key = getKey(sb.toString().split("\\s+"), i + 1);
        }
        return sb.toString();
    }

    private String getKey(String[] words, int index) {
        StringBuilder sb = new StringBuilder();
        for (int i = index; i < index + order; i++) {
            if (i >= words.length) {
                break;
            }
            sb.append(words[i]).append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String args) {
        String inputFile = args;
        int outputLength = Integer.parseInt(args);
        MarkovTextGenerator generator = new MarkovTextGenerator();
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                generator.train(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            System.exit(1);
        }
        String text = generator.generate(outputLength);
        System.out.println(text);
    }
}
