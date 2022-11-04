package easyproblems;

import java.util.Arrays;

public class ToeplitzMatrix {

	public static void main(String[] args) {
		ToeplitzMatrix toeplitz = new ToeplitzMatrix();
		int[][] arr = { {36,59,71,15,26,82,87},{56,36,59,71,15,26,82},{15,0,36,59,71,15,26} };
		toeplitz.operation(arr);

	}

	private void operation(int[][] arr) {
		boolean isValied = true;
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr[i].length-1;j++) {
				
				System.out.println(arr[i][j]+"  "+arr[i+1][j+1]);
				if(arr[i][j]!=arr[i+1][j+1]) {
					System.out.println(arr[i][j]==arr[i+1][j+1]);
					System.out.println(false);
				}
			}
		}System.out.println(true);
		
	}

}
