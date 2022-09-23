package javaDataTypes;

public class Main {

	public static void main(String[] args) {
		// İİlkel Veri Tipleri
		byte kucukSayi = 127; //-128 ve 127 arasındaki sayıları tanımlamak için kullanırız.
		short ortancaSayi = 13455; // -32768 ile 32767 arasında değerler tanımlanabilir.
		int tamSayi = 1017892312; //-2³¹ ile 2³¹-1 arasında değerler tanımlanabilir.
		long buyukSayi = 32321321; //Tamsayı türünde -2⁶³ ile 2⁶³-1 arasında değerler tanımlanabilir.
		float kucukOndalikliSayi = 145.2f; //Ondalık sayı türünde -3.4*10³⁸ ile 3.4*10³⁸ arasında değerler alır.
		double ondalikliSayi = 1031.4; // Ondalık sayı türünde -1.7*10³⁰⁸ ile 1.7*10³⁰⁸ arasında değerler alır.
		char tekKarakter = 'A'; // Karakter türünde değerler alır. Yapılan tanımlama işlemleri tek tırnak arasında yapılmalıdır.
		boolean deger = true;
			
		//Referans Veri Tipleri
		String cokKarakter = "Her Şey yazılabilir";
		
		System.out.println("Byte Değeri : " + kucukSayi +"\nShort Değeri : " + ortancaSayi +"\nTam Sayı Değeri : " + tamSayi +
				"\nLong Değeri : " + buyukSayi + "\nFloat Değeri : " + kucukOndalikliSayi + "\nDouble Değeri : " + ondalikliSayi +
				"\nChar Değeri : " + tekKarakter + "\nBoolean Değeri : " + deger);
		System.out.println("String Dizisi : " + cokKarakter);
		
		

	}

}
