package geometrie_mit_vererbung;

public class Rechteck extends GeomFig {
	protected double breite, laenge;
	protected String farbe;

	protected void datenAusgabe() {
		System.out.println("flaeche = " + flaeche() + "\numfang: " + umfang());
		
	}

	protected double flaeche() {
		// TODO Auto-generated method stub
		flaeche = breite*laenge;
		return flaeche;
	}

	protected double umfang() {
		// TODO Auto-generated method stub
		umfang = 2*breite+2*laenge;
		return umfang;
	}



	
	
}
