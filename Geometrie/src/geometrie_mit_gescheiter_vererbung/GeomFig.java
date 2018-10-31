package geometrie_mit_gescheiter_vererbung;
import java.util.Scanner;

public abstract class GeomFig {
	public static Scanner in = new Scanner(System.in);
	
	protected double flaeche;
	protected double umfang;
	protected double einheit1;
	protected double einheit2;
	
	protected abstract void datenAusgabe();
	protected abstract void datenEingabe();
	protected abstract double flaeche();
	protected abstract double umfang();
	
}
