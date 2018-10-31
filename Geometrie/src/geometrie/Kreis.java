package geometrie;

public class Kreis {
	private double radius,flaeche,umfang;

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}
	public double flaechenBrechnen()
	{
		 flaeche= radius*radius*3.14;
		return flaeche;
	}
	public double umfangberechnen()
	{
			umfang= 2*radius*3.14;
		return umfang;
	}
	public void ausgabe2(){
		System.out.println("Geben Sie den Radius ein:");
	}
	
}
