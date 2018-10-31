package geometrie_mit_gescheiter_vererbung;


public class Main {
	public static void main(String[] args) {
		
		GeomFig obj = null;
		System.out.println("Geometrische Form: ");
		String eingabe = GeomFig.in.nextLine();
		
		if(eingabe.equals("Rechteck")) obj = new Rechteck();
		else if(eingabe.equals("Quadrat")) obj = new Quadrat();
		else if(eingabe.equals("Ellipse")) obj = new Ellipse();
		else if(eingabe.equals("Kreis")) obj = new Kreis();
		else if(eingabe.equals("Dreieck")) obj = new Dreieck();
		else System.out.println("Fehler");
		
		if(obj != null){
			obj.datenEingabe();
			obj.flaeche();
			obj.umfang();
			obj.datenAusgabe();
		}
	}
}
