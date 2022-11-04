package easyproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReveseVowlesString {

	public static void main(String[] args) {
		ReveseVowlesString reverse=new ReveseVowlesString();		
        String a="agha";
        
		reverse.operation(a);
	}

	private void operation(String a){
		
		char[] arr=a.toCharArray();
		ArrayList<Character>vowles=new ArrayList<Character>();
		ArrayList<Integer>position=new ArrayList<Integer>();
		for(int i=0;i<a.length();i++) {
			if((arr[i]+"").equalsIgnoreCase("a")||(arr[i]+"").equalsIgnoreCase("e")||(arr[i]+"").equalsIgnoreCase("i")||(arr[i]+"").equalsIgnoreCase("o")||(arr[i]+"").equalsIgnoreCase("u")) {
			 	vowles.add(arr[i]);
			 	position.add(i);
			}
		}
		for(int i=0;i<position.size();i++) {
				arr[position.get(i)]=vowles.get(vowles.size()-1);vowles.remove(vowles.size()-1);
		}
//		for(char i:arr) {
//			output+=i;
//		}
		String output= String.valueOf(arr);
		
		System.out.println(output);
	}

}
