package String;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MostCommonWord819 {
    class Solution {
        public String mostCommonWord(String paragraph, String[] banned) {
            HashMap<String, Integer> wordOccurence = new HashMap<>();
            HashSet<String> bannedWords = new HashSet<>();
            String clean = "";
            for(int i=0; i<paragraph.length(); i++){
                if(Character.isLetter(paragraph.charAt(i))){
                    clean+=Character.toLowerCase(paragraph.charAt(i)); // can be replaced with string builder
                } else {
                    clean+=" ";
                }
            }
            for(int i=0; i<banned.length; i++){
                bannedWords.add(banned[i]); // can be replace by addAll
            }
            String[] wordArray = clean.replaceAll("  ", " ").split(" ");

            for(int i=0; i<wordArray.length; i++){
                if(!bannedWords.contains(wordArray[i])){
                    if(wordOccurence.containsKey(wordArray[i])){
                        int times = wordOccurence.get(wordArray[i]);
                        times++;
                        wordOccurence.put(wordArray[i], times);
                    } else {
                        wordOccurence.put(wordArray[i], 1);
                    }
                }
            }


            return wordOccurence.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                    .findFirst().get().getKey();
        }
    }
}
