
public class Kreis extends GrundForm {

	private Punkt punkt_1;
	private double radius;
	
	public Kreis(String bezeichnung) {
		super(bezeichnung);
	}

	public Punkt getPunkt() {
		return punkt_1;
	}

	public void setPunkt(Punkt punkt_1) {
		this.punkt_1 = punkt_1;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void kreisInfo() {
		System.out.println(" Bezeichnung: " + bezeichnung);
		System.out.printf(" Zentrum: ");
		System.out.printf(" %-5s %-5s", "X", "Y");
		System.out.println();
		System.out.printf(" %-5s %-5s", punkt_1.getX(), punkt_1.getY());
		System.out.println();
		System.out.println(" Radius: " + getRadius());
	}
	
}
