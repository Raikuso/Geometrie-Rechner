package geometrie;

public class Rechteck {
	private double breite,laenge,flaeche,umfang;

	
	public void setBreite(double breite) {
		this.breite = breite;
	}
	public double getBreite() {
		return breite;
	}
	public void setLaenge(double laenge) {
		this.laenge = laenge;
	}
	public double getLaenge() {
		return laenge;
	}
	public double fleachenBrechnen()
	{
		 flaeche= getLaenge()*getBreite();
		return flaeche;
	}
	public double umfangberechnen()
	{
			umfang= 2*getLaenge()+2*getBreite();
		return umfang;
	}
	public void ausgabe(){
		System.out.println("Geben sie die breite und laenge ein:");
	}
	
	
}
