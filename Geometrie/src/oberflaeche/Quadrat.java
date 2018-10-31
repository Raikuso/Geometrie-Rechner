package oberflaeche;

public class Quadrat extends Rechteck {
	
	Quadrat(double x, double y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	protected void flaecheBerechnen() {
		flaeche = einheit1*einheit1;
	}

	protected void umfangBerechnen() {
		umfang = 4*einheit1;
	}

}
