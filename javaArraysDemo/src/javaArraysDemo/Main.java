package javaArraysDemo;

public class Main {

	public static void main(String[] args) {
		
		String[] ogrenciler = new String[4];
		ogrenciler[0] = "İlhami";
		ogrenciler[1] = "Yasemin";
		ogrenciler[2] = "Dilek";
		ogrenciler[3] = "Şule";
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
			
		}
		
		System.out.println("*************************");
		
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}

	}

}
