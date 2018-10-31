package geometrie_mit_gescheiter_vererbung;

public class Quadrat extends Rechteck {
	
	protected double flaeche() {
		flaeche = einheit1*einheit1;
		return flaeche;
	}

	protected double umfang() {
		umfang = 4 * einheit1;
		return umfang;
	}
	
	protected void datenEingabe() {
		// TODO Auto-generated method stub
		System.out.println("Breite: ");
		einheit1 = in.nextDouble();
	}
	
}
