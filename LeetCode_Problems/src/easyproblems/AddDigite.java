package easyproblems;

public class AddDigite {

	public static void main(String[] args) {
		AddDigite arr = new AddDigite();
		arr.operation();
	
	}
	
	private void operation() {
		int number = 38;
                var aa=0;
		boolean isValied = true;
		int total = 0;
		while (isValied) {
			total += number % 10;
			number = number / 10;
			System.out.println(total);
			if (number == 0) {
				System.out.println(total);
				if (total > 9) {
					number += total;
					total = 0;
					
				} else {
					total=total+number;
					System.out.println(total);
					isValied = false;
				}
			}
		}
		System.out.println(total);
	}

}
