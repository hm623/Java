import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Frequency {

    void Run(){

    File file = new File("files/file.txt");

    Map<Character, Integer> frequencyMap = new HashMap<>();

    String [] arr = {"","","","",""};
    int l = 0;

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();
            while (line != null) {
                arr[l] = line;
                l++;
                System.out.println(line);
                line = bufferedReader.readLine();
                

            }

            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    

        for (int i = 0; i < arr.length; i++){

            char[] names = new char[arr[i].length()];

            for (int j = 0; j < arr[i].length(); j++) {
                names[j] = arr[i].charAt(j);
            }

            for (int k = 0; k < names.length; k++){
            
                if (frequencyMap.containsKey(names[k])){
                    frequencyMap.put(names[k],frequencyMap.get(names[k]) + 1);
                }
                else{
                    frequencyMap.put((names[k]), 1);
                }


            }

        }

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }





    }
    
}


