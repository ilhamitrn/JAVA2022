package javaPerfectNumber;

public class Main {

	public static void main(String[] args) {
		
		int number=1;
		int total= 0;
		for(int i = 1;i<number;i++) {
			if(number % i == 0) {
				total +=i;
			}
		}
		
		if(number==1) {
			System.out.println("Invalid Number");
			return;
		}
		
		
		if(total == number) {
			System.out.println(number + " is \"PERFECT NUMBER\"");
		}
		else {
			System.out.println(number + " is not a \"PERFECT NUMBER\"");
		}
		 
	}

}
