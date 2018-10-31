package oberflaeche;

public class Kreis extends GeoFig {
	
	Kreis(double x, double y) {
		super(x, y);
	}

	protected void flaecheBerechnen() {
		flaeche = 3.14 * einheit1 * einheit1;
	}

	protected void umfangBerechnen() {
		umfang = 2 * 3.14 * einheit1;
	}

}
