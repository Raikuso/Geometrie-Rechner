package geometrie_mit_gescheiter_vererbung;

public class Ellipse extends GeomFig {
	
	protected double flaeche(){
		flaeche = (3.14*einheit1*einheit2)/4;
		return flaeche;
	}
	
	protected double umfang(){
		umfang = (3.14*(einheit1+einheit2)/2);
		return umfang;
	}

	protected void datenAusgabe() {
		System.out.println("flaeche = " + flaeche() + "\numfang: " + umfang());
		
	}

	@Override
	protected void datenEingabe() {
		// TODO Auto-generated method stub
		System.out.println("Groﬂe Halbachse: ");
		einheit1 = in.nextDouble();
		System.out.println("Kleine Halbachse: ");
		einheit2 = in.nextDouble();
	}
}
