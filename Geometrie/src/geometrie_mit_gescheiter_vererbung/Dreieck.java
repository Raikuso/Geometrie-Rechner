package geometrie_mit_gescheiter_vererbung;

public class Dreieck extends GeomFig{

	@Override
	protected void datenAusgabe() {
		System.out.println("flaeche = " + flaeche() + "\numfang: " + umfang());
		
	}

	@Override
	protected double flaeche() {
		flaeche = (einheit1 * einheit2)/2;
		return flaeche;
	}

	@Override
	protected double umfang() {
		umfang = 3*einheit1;
		return umfang;
	}

	@Override
	protected void datenEingabe() {
		// TODO Auto-generated method stub
		System.out.println("Breite: ");
		einheit1 = in.nextDouble();
		System.out.println("Hoehe: ");
		einheit2 = in.nextDouble();
	}

}
