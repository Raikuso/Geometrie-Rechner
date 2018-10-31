package geometrie_mit_vererbung;

public class Kreis extends Ellipse {
	protected double radius;
	
	protected double flaeche() {
		flaeche = radius*radius*3.14;
		return flaeche;
	}

	protected double umfang() {
		umfang = 2 * 3.14 * radius;
		
		return umfang;
	}

	
}
