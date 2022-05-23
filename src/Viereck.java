
public class Viereck extends GrundForm {

	private Punkt punkt_1;
	private Punkt punkt_2;
	private Punkt punkt_3;
	private Punkt punkt_4;
	
	public Viereck(String bezeichnung) {
		super(bezeichnung);
	}
	
	public Punkt getPunkt_1() {
		return punkt_1;
	}

	public void setPunkt_1(Punkt punkt_1) {
		this.punkt_1 = punkt_1;
	}

	public Punkt getPunkt_2() {
		return punkt_2;
	}

	public void setPunkt_2(Punkt punkt_2) {
		this.punkt_2 = punkt_2;
	}

	public Punkt getPunkt_3() {
		return punkt_3;
	}

	public void setPunkt_3(Punkt punkt_3) {
		this.punkt_3 = punkt_3;
	}

	public Punkt getPunkt_4() {
		return punkt_4;
	}

	public void setPunkt_4(Punkt punkt_4) {
		this.punkt_4 = punkt_4;
	}
	
	public void viereckInfo() {
		System.out.println(" Bezeichnung: " + bezeichnung);
		System.out.println(" Koordinaten: ");
		System.out.printf(" %-5s %-5s", "X", "Y");
		System.out.println();
		System.out.printf(" %-5s %-5s", punkt_1.getX(), punkt_1.getY());
		System.out.println();
		System.out.printf(" %-5s %-5s", punkt_2.getX(), punkt_2.getY());
		System.out.println();
		System.out.printf(" %-5s %-5s", punkt_3.getX(), punkt_3.getY());
		System.out.println();
		System.out.printf(" %-5s %-5s", punkt_4.getX(), punkt_4.getY());
		System.out.println();
	}

	
	
}
