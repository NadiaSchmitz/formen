
public class Main {

	public static void main(String[] args) {
		
		Punkt punkt_1 = new Punkt(2.0,2.0);
		Punkt punkt_2 = new Punkt(2.0,6.0);
		Punkt punkt_3 = new Punkt(6.0,6.0);
		Punkt punkt_4 = new Punkt(6.0,2.0);
		Punkt punkt_5 = new Punkt(12.0,7.0);
		
		// Viereck
		Viereck mein_viereck = new Viereck("Mein Viereck");
		
		mein_viereck.setPunkt_1(punkt_1);
		mein_viereck.setPunkt_2(punkt_2);
		mein_viereck.setPunkt_3(punkt_3);
		mein_viereck.setPunkt_4(punkt_4);
		
		mein_viereck.viereckInfo();
		
		// Kreis
		Kreis mein_kreis = new Kreis("Mein Kreis");
		
		mein_kreis.setPunkt(punkt_5);
		mein_kreis.setRadius(3.5);
		
		mein_kreis.kreisInfo();

	}

}
