package geometrie_mit_vererbung;

public class Dreieck extends GeomFig{
	protected double breite, hoehe;

	@Override
	protected void datenAusgabe() {
		System.out.println("flaeche = " + flaeche() + "\numfang: " + umfang());
		
	}

	@Override
	protected double flaeche() {
		flaeche = (hoehe * breite)/2;
		return flaeche;
	}

	@Override
	protected double umfang() {
		umfang = 3*breite;
		return umfang;
	}

}
