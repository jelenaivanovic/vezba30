package com.jelena;

public class Test {

	public static void main(String[] args) {
		ZdrastvenaUstanova z1 =  new ZdrastvenaUstanova();
		z1.naziv = "KCS";
		z1.adresa = "Pasterova 2";
		z1.ispisi();
		
		ZdrastvenaUstanova z2 =  new ZdrastvenaUstanova("Dom Zdravlja Vozdovac");
		z2.ispisi();
		
		ZdrastvenaUstanova z3 =  new ZdrastvenaUstanova("Reumatoloski centar", "Resavska 67");
		z3.ispisi();
		
		
		

	}

}
