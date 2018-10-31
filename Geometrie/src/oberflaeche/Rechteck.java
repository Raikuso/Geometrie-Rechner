package oberflaeche;

public class Rechteck extends GeoFig {

	Rechteck(double x, double y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	protected void flaecheBerechnen() {
		flaeche = einheit1*einheit2;
	}

	protected void umfangBerechnen() {
		umfang = 2* einheit2 + 2* einheit1;
	}
	
}
