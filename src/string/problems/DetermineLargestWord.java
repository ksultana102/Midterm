package string.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s = "Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        //implement

        String ans = "";
        int maxWordLength = 0;

        for(Integer key: wordNLength.keySet()) {
            if(key >= maxWordLength) {
                maxWordLength = key;

                ans = maxWordLength + " " + wordNLength.get(key);
            }
        }

        System.out.println(ans);

    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";
        //implement
        String[] wordGivenArray = wordGiven.split(" ");

        // Normal For
        for (int i = 0; i < wordGivenArray.length; i++) {
            map.put(wordGivenArray[i].length(), wordGivenArray[i]);
        }

        //Foreach for
        for (String word : wordGivenArray) {
            map.put(word.length(), word);
        }

        // 5 Human
        //5 brain
        // 2 is
        // 1 a
        // 6 coffee

        return map;
    }



        /*String[] words=wordGiven.split(" ");
        int length=0;
        if(length<wordGiven.length()){
            length=wordGiven.length();
        }
        return map;
    }
}*/

//    public static void main (String[]args){
//        String phrase="The astronaut landed on the moon";
//        System.out.println(findLargestWord(phrase));//print astronuts
//    }
//    public static String findLargestWord(String sentence){
//        String[] words=sentence.split("  ");
//        String largestWord="";
//        for(int i=0; i<words.length; i++){
//            if (largestWord.length() > words[i].length()) {
//                largestWord=words[i];
//
//            }
//        }
//        return largestWord;
//    }
}

