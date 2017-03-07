package passwortchecker;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Passwortchecker {

	public static void main(String[] args) {
		umwandeln();
		passwortUeberpruefen();
		grossbuchstabenUeberpruefen();

	}

	static String passwort = "Test1234";
	static List<Character> passwortArray = new ArrayList<Character>();
	static int grossbuchstaben = 0;
	static int kleinbuchstaben = 0;
	static int zahl = 0;
	static int laenge = 0;
	static int sonderzeichenDa = 0;
	public static void umwandeln()
	{
		passwortArray = passwort.chars().mapToObj((i) -> Character.valueOf((char)i)).collect(Collectors.toList());
		System.out.println(passwortArray);
	}
	
	public static void passwortUeberpruefen()
	{
     		if(passwortArray.size() > 7)
     		{
     			System.out.println("Das Passwort ist lang genug!");
     		}else {
     			System.out.println("Das Passwort ist zu kurz!");
     		}
	}
	
	public static void grossbuchstabenUeberpruefen()
	{
		for (int i = 0; i < passwortArray.size();i++)
		{
			 if (Character.isUpperCase(passwortArray.get(i)))
			 {
				 grossbuchstaben = 1;
				 System.out.println("Grossbuchstabe gefunden!");
			 }else if (Character.isLowerCase(passwortArray.get(i))) 
			 {
				 kleinbuchstaben = 1;
				 System.out.println("Kleinbuchstaben gefunden!");
			 }else if (Character.isDigit(passwortArray.get(i)))
			 {
				 zahl = 1;
				 System.out.println("Zahl gefunden!");
			 }else
			 {
				 sonderzeichenDa = 1;
				 System.out.println("Sonderzeichen gefunden!");
			 }
		}
	}
}
