package easyproblems;

public class CorrectTime {

	public static void main(String[] args) {
		CorrectTime correctTime=new CorrectTime();		
        correctTime.operation("11:00","11:01");
	}

	private void operation(String current, String correct) {
	int	currentTime=Integer.parseInt(current.substring(0,2));
	int	currentMin=Integer.parseInt(current.substring(3,5));
	int	correctTime=Integer.parseInt(correct.substring(0,2));
	int	correctMin=Integer.parseInt(correct.substring(3,5));
		correct=correct.substring(0,current.length());
		System.out.println(currentTime+" "+currentMin);
		System.out.println(correctTime+" "+correctMin);
		int count=0;
		boolean isValied=true;
		while(isValied){
			currentTime++;
			count++;
		}if(currentMin<correctMin) {
			count++;
		}
		System.out.println(count);	
	}

}
