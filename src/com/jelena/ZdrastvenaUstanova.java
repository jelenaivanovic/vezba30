package com.jelena;

public class ZdrastvenaUstanova {
	String naziv;
	String adresa;
	
	ZdrastvenaUstanova(){
		String naziv = "nepoznato";
		String adresa = "nepoznato";
		
	}
	
	ZdrastvenaUstanova(String naziv1){
		naziv = naziv1;
		
	}
	
	ZdrastvenaUstanova(String naziv1, String adresa1){
		naziv = naziv1;
		adresa= adresa1;
		
	}
	 void ispisi() {
		 
		 System.out.println("Naziv je "+ naziv + "i adresa je " + adresa);
	 }
	

}
