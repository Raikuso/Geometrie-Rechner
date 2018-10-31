package geometrie_mit_gescheiter_vererbung;

public class Rechteck extends GeomFig {

	protected void datenAusgabe() {
		System.out.println("flaeche = " + flaeche() + "\numfang: " + umfang());
		
	}

	protected double flaeche() {
		// TODO Auto-generated method stub
		flaeche = einheit1*einheit2;
		return flaeche;
	}

	protected double umfang() {
		// TODO Auto-generated method stub
		umfang = 2*einheit1+2*einheit2;
		return umfang;
	}

	@Override
	protected void datenEingabe() {
		// TODO Auto-generated method stub
		System.out.println("Breite: ");
		einheit1 = in.nextDouble();
		System.out.println("Laenge: ");
		einheit2 = in.nextDouble();
	}



	
	
}
