package passwortchecker;

import java.util.List;
import java.util.stream.Collectors;

public class Harshad {

	public static void main(String[] args) {
		umwandelnStringZurListe();
		harshadZahlenKontrolle();
		harshadZahlenAusrechnen();

	
		
	}
	static int harshadZahlen = 24;
	
	static List<Character> liste;
	
	static String harshadZahlen1 = "" + harshadZahlen;
	
	static int quersumme;
	
	static int modulo;
	
	public static void umwandelnStringZurListe()
	{
		liste = harshadZahlen1.chars().mapToObj((i) -> Character.valueOf((char)i)).collect(Collectors.toList());
		System.out.println(liste);
	}
	
		public static void harshadZahlenKontrolle()
		{
			for(int i = 0; i < liste.size(); i++)
			{
				quersumme = quersumme + liste.get(i) -48 ;
				System.out.println(quersumme);
			}
		}
		public static void harshadZahlenAusrechnen()
		{
			modulo = harshadZahlen % quersumme;
			if( modulo == 0){
				System.out.println("Es ist eine Hashad-Zahl!");
			}else{
				System.out.println("Es ist keine Hashad-Zahl! ");
			}
			
		}
} 