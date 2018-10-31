package oberflaeche;



public class Dreieck extends GeoFig {

	Dreieck(double x, double y) {
		super(x, y);
	}

	protected void flaecheBerechnen() {
		flaeche = (einheit2 * einheit1)/2;
	}

	protected void umfangBerechnen() {
		umfang = einheit1*3;
	}

}