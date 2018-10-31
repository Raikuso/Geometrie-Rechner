package geometrie_mit_gescheiter_vererbung;

public class Kreis extends Ellipse {
	
	protected double flaeche() {
		flaeche = einheit1*einheit1*3.14;
		return flaeche;
	}

	protected double umfang() {
		umfang = 2 * 3.14 * einheit1;
		
		return umfang;
	}
	
	protected void datenEingabe() {
		// TODO Auto-generated method stub
		System.out.println("Radius: ");
		einheit1 = in.nextDouble();
		
	}
	
}
