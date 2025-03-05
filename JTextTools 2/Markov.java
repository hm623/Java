import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Random;
import java.util.Vector;
import java.io.*;



public class Markov{
    public static Hashtable<String, Vector<String>> markovKey = new Hashtable<String, Vector<String>>();
    static Random rand = new Random();
    int lines;



    public void addWords(String phrase){

        String [] tempArr = new String[2000];
        tempArr = phrase.split(" ");

        for (int i = 0; i < tempArr.length; i++ ){
            
            if ((i == 0) && (tempArr.length !=1)){

                Vector<String> begWord = markovKey.get("__$");
				begWord.add(tempArr[i]);

                if (!(markovKey.containsKey(tempArr[i]))){

                    markovKey.put(tempArr[i], new Vector<String>());
                    Vector<String> wordLink = markovKey.get(tempArr[i]);
                    
                   
                    wordLink.add(tempArr[i+1]);
                   
                    
                }

                else{

                    Vector<String> wordLink = markovKey.get(tempArr[i]);
                    wordLink.add(tempArr[i+1]);
                    
                }



            }

            else if ((i == 0) && (tempArr.length ==1)){

                Vector<String> begWord = markovKey.get("__$");
				begWord.add(tempArr[i]);

                if (!(markovKey.containsKey(tempArr[i]))){

                    markovKey.put(tempArr[i], new Vector<String>());
                        
                }

                else{
                  continue;
                }



            }

            else if ((i != 0) && (i != (tempArr.length - 1))){
                
                if (!(markovKey.containsKey(tempArr[i]))){

                    markovKey.put(tempArr[i], new Vector<String>());
                    Vector<String> wordLink = markovKey.get(tempArr[i]);
                    
                   
                    wordLink.add(tempArr[i+1]);
                   
                    
                }

                else{

                    Vector<String> wordLink = markovKey.get(tempArr[i]);
                    wordLink.add(tempArr[i+1]);
                    
                }
            }

            else if (i == (tempArr.length -1)){

                if (!(markovKey.containsKey(tempArr[i]))){

                    markovKey.put(tempArr[i], new Vector<String>());
                   
                }

            }

        }

       

    }



    public void genText(){


        Vector<String> newText = new Vector<String>();
        String nextWord = "";

        for (int k = 0; k < lines; k++){


            Vector<String> startWords = markovKey.get("__$");
            nextWord = startWords.get(rand.nextInt(startWords.size()));

            if (startWords.size() == 0){
                
                continue;
            }

            else{

                for (int i = 0; i < startWords.size(); i++){

                    newText.add(nextWord);
                    startWords = markovKey.get(nextWord);
                    nextWord = startWords.get(rand.nextInt(startWords.size()));

                    if (startWords.size() == 0){
                
                        continue;
                    } 

                    while (startWords.size() != 0){
                        newText.add(nextWord);
                        startWords = markovKey.get(nextWord);

                        if (startWords.size() == 0){
                            break;
                        }
                        
                        nextWord = startWords.get(rand.nextInt(startWords.size()));

                    }


                }
            }

        }        

        Enumeration<String> enu = newText.elements();


        System.out.println();
        System.out.println();
        System.out.println(markovKey);
        System.out.println();
        System.out.println();
 
        
        while (enu.hasMoreElements()) {
            System.out.print(enu.nextElement() + " ");
        }
        
    }



    public void Run() {

        markovKey.put("__$", new Vector<String>());

        File file = new File("files/Markov.txt");

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();
            while (line != null) {
                addWords(line);
                line = bufferedReader.readLine();
                lines++;
            }

            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        genText();

        


    }

}
