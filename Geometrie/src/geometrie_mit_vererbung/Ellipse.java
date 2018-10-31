package geometrie_mit_vererbung;

public class Ellipse extends GeomFig {
	protected String farbe;
	protected double grosseHalbachse, kleineHalbachse;
	
	protected double flaeche(){
		flaeche = (3.14*grosseHalbachse*kleineHalbachse)/4;
		return flaeche;
	}
	
	protected double umfang(){
		umfang = (3.14*(grosseHalbachse+kleineHalbachse)/2);
		return umfang;
	}

	protected void datenAusgabe() {
		System.out.println("flaeche = " + flaeche() + "\numfang: " + umfang());
		
	}
}
