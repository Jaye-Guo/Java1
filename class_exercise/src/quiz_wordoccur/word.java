package quiz_wordoccur;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class word {
	
	public static void main(String[] args) {
		String[] words = {"good","morning","class","have","a","good","class","and","have","fun"};
		countAndDisplayAll(words);
		System.out.println();
		countNdisplay(words);
	}
	
	//method 1
	//loop through each word
	static Map<String, Integer> countOccurs(String[] words){
		Map<String, Integer> wordOccur = new HashMap<>();
		
		for (String word : words) {
			Integer occur = wordOccur.get(word);
			if(occur == null) {
				wordOccur.put(word, 1);
			}
			else {
				int newOccur = occur.intValue()+1;
				wordOccur.put(word, newOccur);
			}
		}
		return wordOccur;
	}
	
	static void displayAll(Map<String, Integer> wordOccurs) {
		Set<String> allWords =  wordOccurs.keySet();
		for(String word : allWords) {
			System.out.println(word + "\t" + wordOccurs.get(word));
		}
			
	}
	
	static void countAndDisplayAll(String[] words) {
		Map<String, Integer> wordOccurs = countOccurs(words);
		displayAll(wordOccurs);
	}
	
	//method 2
	//loop through each key
	static void displayOccurs(Map<String, Integer> wordOccurs) {
		Set<String> allwords = wordOccurs.keySet();
		for (String word : allwords) {
			System.out.println(word + "\t" + wordOccurs.get(word));
		}
	}
	
	static void countNdisplay(String[] words) {
		Map<String, Integer> wordoccurs = countOccurs(words);
		displayOccurs(wordoccurs);
	}
}
