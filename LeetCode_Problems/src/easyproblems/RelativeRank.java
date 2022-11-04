package easyproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RelativeRank {

	public static void main(String[] args) {
		RelativeRank rank=new RelativeRank();
		int[] arr= {10,3,8,9,4};
		System.out.println(rank.operation(arr));
	}

	private String[] operation(int[] arr) {
		String[] result=new String[arr.length];
		ArrayList<Integer>sort=new ArrayList<Integer>();
		for(int i:arr) {
			sort.add(i);
		}Collections.sort(sort);
		
			int k=0;
			int count=0;
				for(int i=0;i<arr.length;i++) {
				if(sort.get(sort.size()-1)==arr[i]){
					if(k==1){
						count++
						result[i]="Gold Medal";
					}else if(k==2) {
						count++;
						result[i]="Silver Medal";
					}else if(k==3) {
						count++;
						result[i]="Bronze Medal";
					}else {
						count++;
						result[i]=k+"";
					}
				}k++;
				sort.remove(sort.size()-1);
				if(count) {
					
				}
			
		}
				System.out.println(Arrays.toString(result));
		return null;
	}

	

}
