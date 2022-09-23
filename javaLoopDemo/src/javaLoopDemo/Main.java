package javaLoopDemo;

public class Main {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i += 2) {
			System.out.println(i);
		}
		System.out.println("Döngü Bitti");

		int i = 0;
		while (i <= 10) {
			System.out.println(i);
			i+=2;
		}
		System.out.println("While Döngüsü Bitti");
	}
}
