package mediumlevel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestPalindrom {

	public static void main(String[] args) {
		LongestPalindrom longestPalindrom = new LongestPalindrom();
		String[] words = {"dd","aa","bb","dd","aa","dd","bb","dd","aa","cc","bb","cc","dd","cc"};
		//String[] words= {"ab","ty","yt","lc","cl","ab"};
		System.out.println(longestPalindrom.operation(words));

	}

	private int operation(String[] words) {
		ArrayList<String> dublicateWord_removed = new ArrayList<>(Arrays.asList(words));
		Map<String, Integer> words_count = new HashMap<String, Integer>();
		int count=0;
		int totalcount=0;
		for (String word : dublicateWord_removed) {

			char[] convertTochar = word.toCharArray();
			Arrays.sort(convertTochar);
			String name=Arrays.toString(convertTochar);
			System.out.println(name);
			
				if (words_count.containsKey(name)) {
					totalcount=words_count.get(name)+1;
					System.out.println(totalcount);
					words_count.put(name, totalcount);
				} else {
					words_count.put(name, 1);
				}
			}
		
		for(Map.Entry<String,Integer>j:words_count.entrySet()) {
			System.out.println(j.getKey()+"   "+j.getValue());
			if(j.getValue()!=1){
				if(j.getValue()%2==1) {
				count+=(j.getValue()-1)*2;
				}else {
					count+=j.getValue()*2;
				}
			}
			if(j.getValue()==1||j.getValue()%2==1) {	
			  totalcount=2;
			}
		
		}
		return count+totalcount;
	}
}
