package javaFindNumbers;

public class Main {

	public static void main(String[] args) {

		int[] sayilar = new int[] { 1, 3, 4, 6, 7, 4, 2, 1, 2 };
		int aranacakSayi = 21;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacakSayi) {
				varMi = true;
				break;
			}

		}
		if (varMi) {
			System.out.println("Sayı Mevcuttur");
		} else {
			System.out.println("Sayı mevcut değildir");
		}

	}

}
