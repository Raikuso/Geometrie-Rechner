package geometrie;
import java.util.Scanner;

public class Main {

	

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		Rechteck r1 = new Rechteck();
		Kreis k1 = new Kreis();
		System.out.println("Kreis oder Rechteck:");
		String eingabe1 = in.nextLine();
		String eingabe;
		if(eingabe1.equals("Rechteck")){
		
		
			System.out.println("was wollen sie berechnen? : Flaeche oder umfang");
			eingabe = in.nextLine();
			if(eingabe.equals("Flaeche"))
			{	
				r1.ausgabe();
				r1.setBreite(in.nextDouble());
				r1.setLaenge(in.nextDouble());
				System.out.println("die Flaeche betraegt:" + r1.fleachenBrechnen());
			
			}
			if(eingabe.equals("Umfang"))
			{	
				r1.ausgabe();
				r1.setBreite(in.nextDouble());
				r1.setLaenge(in.nextDouble());
				System.out.println("die Flaeche betraegt:" + r1.umfangberechnen());
			}
		

		}
		else if(eingabe1.equals("Kreis"))
		{
			
			System.out.println("was wollen sie berechnen? : Flaeche oder Umfang");
			 eingabe = in.nextLine();
			 if(eingabe.equals("Flaeche"))
				{	
					k1.ausgabe2();
					k1.setRadius(in.nextDouble());
					
					System.out.println("die Flaeche betraegt:" + k1.flaechenBrechnen());
				
				}
			 if(eingabe.equals("Umfang"))
				{	
					k1.ausgabe2();
					k1.setRadius(in.nextDouble());
					
					System.out.println("die Flaeche betraegt:" + k1.umfangberechnen());
				
				}
				
			 
			
			 
				}
	}

	
}
