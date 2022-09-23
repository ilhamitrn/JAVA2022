package javaSesliHarfler;

public class Main {

	public static void main(String[] args) {

		char harf = 'E';
		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın Bir Ünlüdür");
			break;

		case 'E':
		case 'İ':
		case 'Ö':
		case 'Ü':
			System.out.println("İnce Bir Ünlüdür");
			break;
		default:
			System.out.println("Ünsüz bir harf girdiniz");
			break;
		}
	}

}
