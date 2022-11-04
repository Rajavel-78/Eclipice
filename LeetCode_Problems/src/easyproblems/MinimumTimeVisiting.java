package easyproblems;

public class MinimumTimeVisiting {

	public static void main(String[] args) {
		MinimumTimeVisiting minimum=new MinimumTimeVisiting();
        int [][] arr= {{1,3},{1,4},{4,3},{3,4}};
		minimum.operation(arr);

	}

	private void operation(int[][] arr) {
		int a=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length;j++) {
				if(arr[i][0]>=arr[j][0]&&arr[i][1]>=arr[j][1]) {
					a=j;
				}
			}
			break;
		
		}System.out.println(a);
		
	}

}
