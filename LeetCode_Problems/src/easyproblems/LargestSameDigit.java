package easyproblems;

import java.util.ArrayList;

public class LargestSameDigit {

	public static void main(String[] args) {
		LargestSameDigit digit=new LargestSameDigit();
		digit.operation("6771339");

	}

	private void operation(String num) {
		String s="";
		String b="0";
		String max="0";
		boolean isValied=true;
		ArrayList<Integer>arr=new ArrayList<Integer>();
		for(int i=0;i<num.length()-2;i++){
			s+=num.charAt(i);
			 if((num.charAt(i)+"").equals(num.charAt(i+1)+"")&&(num.charAt(i)+"").equals(num.charAt(i+2)+"")) {
				 s+=num.charAt(i+1)+""+num.charAt(i+2)+"";
				 System.out.println(s);
				 if(s.length()==3) {
					 b=s;
					 isValied=false;
					 if(Integer.parseInt(b)>Integer.parseInt(max)) {
						 max=b;
					 }
				 arr.add(Integer.parseInt(s));
				 }
			 }else {
				 s="";
			 }
		}if(isValied) {
			System.out.println("");
		}else if(max.equals("0")) {
			System.out.println("000");
		}else {
			System.out.println(max);
		}
//		System.out.println(arr);
//		System.out.println(max);
	}

}
