package geometrie_mit_vererbung;

public class Quadrat extends Rechteck {
	protected double breite;
	
	protected double flaeche() {
		flaeche = breite*breite;
		return flaeche;
	}

	protected double umfang() {
		umfang = 4 * breite;
		
		return umfang;
	}
	
}
