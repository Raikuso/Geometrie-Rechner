package geometrie_mit_vererbung;

public abstract class GeomFig {
	protected double flaeche;
	protected double umfang;
	protected String farbe;
	
	protected abstract void datenAusgabe();
	protected abstract double flaeche();
	protected abstract double umfang();
	
}
