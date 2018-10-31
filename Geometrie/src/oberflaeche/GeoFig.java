package oberflaeche;

public abstract class GeoFig {
	GeoFig(double x, double y){
		einheit1 = x;
		einheit2 = y;
		flaecheBerechnen();
		umfangBerechnen();
	}
	protected static double flaeche;
	protected static double umfang;
	protected double einheit1;
	protected double einheit2;
	
	
	protected abstract void flaecheBerechnen();
	protected abstract void umfangBerechnen();
	
	public static double gibflaeche(){
		return flaeche;
	}
	
	public static double gibumfang(){
		return umfang;
	}
		
}
