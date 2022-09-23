package javaAsalSayi;

public class Main {

	public static void main(String[] args) {

		int number = -3;
		int remainder = number % 2;
		boolean isPrime = true;

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}

		if (number < 1) {
			System.out.println("Geçersiz Sayı Girdiniz");
			return;
		}

		if (number == 1) {
			System.out.println("Sayı Asal değildir");
			return;
		}

		if (isPrime == true) {
			System.out.println("Sayı Asaldır");
		} else if (number == 2) {
			System.out.println("Sayı Asaldır.");
		} else {
			System.out.println("Sayı Asal Değildir...");
		}

	}

}
