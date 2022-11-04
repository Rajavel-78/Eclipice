package easyproblems;

public class NthNumber {

	public static void main(String[] args) {
		NthNumber num=new NthNumber();
		System.out.println(num.findNthDigit(10));
	}
	public int findNthDigit(int n) {
	       long count=0;
	       int i=0;
	        for(i=1;i<=n;i++){
	            if(count==n){
	                break;
	            }
	           if(i>=10&&i>100){
	               count+=2;
	           }else if(i>=100&&1000>i){
	               count+=3;
	           }else if(i>=10000&&i<100000){
	               count+=4;
	           }  
	        }
	        return i;
	        } 
}
