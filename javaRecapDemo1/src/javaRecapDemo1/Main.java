package javaRecapDemo1;

public class Main {

	public static void main(String[] args) {
		
		int sayi1 = 28;
		int sayi2 = 46;
		int sayi3 = 75;
		
		int enBuyuk = sayi1;
		
		if(enBuyuk<sayi2) {
			enBuyuk = sayi2;
		}
		if(enBuyuk<sayi3) {
			enBuyuk = sayi3;
		}
		
		System.out.println("En Büyük : " + enBuyuk);
	}

}
