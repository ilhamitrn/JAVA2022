package javaFriendlyNumber;

public class Main {

	public static void main(String[] args) {
		
		int number1 = 1184;
		int number2 = 1210;
		int totalNumber1 = 0;
		int totalNumber2 = 0;
		
		for(int i=1;i<number1;i++) {
			if(number1 % i == 0) {
				totalNumber1 +=i;
			}
		}
		
		for(int i=1;i<number2;i++) {
			if(number2 % i == 0) {
				totalNumber2 +=i;
			}
		}
		
		if((totalNumber1 == number2) && (totalNumber2 == number1)) {
			System.out.println(number1 + "-" + number2 + "  Friendly Numbers");
		}
		else {
			System.out.println(number1 + "-" + number2 + " Not Friendly Numbers ");
		}

	}

}
