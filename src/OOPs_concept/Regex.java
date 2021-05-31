package OOPs_concept;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	
	protected static List<String> getTokens(String pattern)
	{
		String text = "Splitting a string.. it's as easy as 11 2 33!  Right??";
		//String text="Senteeeeeeeeeences";
		ArrayList<String> tokens = new ArrayList<String>();
		Pattern tokSplitter = Pattern.compile(pattern);
		Matcher m = tokSplitter.matcher(text);
		
		while (m.find()) {
			tokens.add(m.group());
		}
		
		return tokens;
	}
	public static void main(String args[])
	{
		//String word="Senteeeeeeeeeences";
		List<String> array = getTokens("[^.!?, ]+");
	   for(String a : array)
	    System.out.println("Tokens are :"+a+"**");
	    
	   // return syllable;
	    
		/*String pattern = "[.!?]+";
		//String pattern = "[1+2+3+?+!+]";
		List<String> list = getTokens(pattern);
		for(String token:list)
			System.out.println(token);
		System.out.println(list.size());*/
	    
		/*int syllables; // Counts total number of syllables in a word
		int count=0;// Counts total number of syllables in text
		List<String> words = getTokens("[.!? ]+");
		for(String word : words)
		{
			syllables=countSyllables(word);
			count=count+syllables;
		}
		return count;*/
	}
}
