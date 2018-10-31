package geometrie_mit_vererbung;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
			System.out.println("Geometrische Form: ");
			String form = in.nextLine();
			if(form.equals("Dreieck")){
				Dreieck d1 = new Dreieck();
				System.out.println("Breite: ");
				d1.breite = in.nextDouble();
				System.out.println("Hoehe: ");
				d1.hoehe = in.nextDouble();
				d1.datenAusgabe();
			}else if(form.equals("Rechteck")){
				Rechteck r1 = new Rechteck();
				System.out.println("Breite: ");
				r1.breite = in.nextDouble();
				System.out.println("Laenge: ");
				r1.laenge = in.nextDouble();
				r1.datenAusgabe();
			}else if(form.equals("Quadrat")){
				Quadrat q1 = new Quadrat();
				System.out.println("Breite: ");
				q1.breite = in.nextDouble();
				q1.datenAusgabe();
			}else if (form.equals("Ellipse")){
				Ellipse e1 = new Ellipse();
				System.out.println("Grosse Halbachse: ");
				e1.grosseHalbachse = in.nextDouble();
				System.out.println("Kleine Halbachse: ");
				e1.kleineHalbachse = in.nextDouble();
				e1.datenAusgabe();
			}else if (form.equals("Kreis")){
				Kreis k1 = new Kreis();
				System.out.println("Radius: ");
				k1.radius = in.nextDouble();
				k1.datenAusgabe();
			}else{
				System.out.println("Form ungültig");
			}
	}
}
