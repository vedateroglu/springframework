package com.vesg.springframework;

public class C {
	
	public C(){
		System.out.println("C sınıfının parametresiz hazırlayıcı metodu.");
	}
	public C(A aNesnesi,B bNesnesi){
		System.out.println("C sınıfının A ve B tipinde 2 parametreli hazırlayıcı metodu.");
		
		aNesnesi.konsolaYaz();
		bNesnesi.sonucuGoster();
		System.out.println();
	}
	public C(String mesaj,int sayi){
		System.out.println("C sınıfın String ve int tipinde 2 parametreli hazırlayıcı metodu.");
		System.out.println(mesaj+" "+sayi);
	}
}