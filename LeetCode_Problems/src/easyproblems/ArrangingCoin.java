package easyproblems;

public class ArrangingCoin {

	public static void main(String[] args) {
		ArrangingCoin coin=new ArrangingCoin();
		System.out.println(coin.operation(8));
	}
	public int operation(int r) {
		int rows=0;
		int ro=0;
		int i=1;
		while(r>=0) {
			r-=i++;
			rows++;
		}
		return rows-1;
	}

}
