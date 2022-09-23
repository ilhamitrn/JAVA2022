package javaRecapDemo2;

public class Main {

	public static void main(String[] args) {
		
		double[] myList = {11.1,1.2,3.4,5.6,7.9};
		double toplam= 0;
		double max = myList[0];
		for(double number : myList) {
			if(max<number) {
				max = number;
			}
			toplam+= number;
			System.out.println(number);
		}
		System.out.println("Toplam : " + toplam);
		System.out.println("En Büyük : " + max);
	}

}
