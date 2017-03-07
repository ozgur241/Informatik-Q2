import java.util.List;
import java.util.stream.Collectors;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static String zeichenkette1 = "Despeation";
	
	static String zeichenkette2 =  "A Rope Ends It";
	
	static List<Character> liste1;
	
	static List<Character> liste2;

	public static void umwandeln()
	{
		zeichenkette1 = zeichenkette1.toLowerCase();
		
		zeichenkette2 = zeichenkette2.toLowerCase();
		
		liste1 = zeichenkette1.chars().mapToObj((i) -> Character.valueOf((char)i)).collect(Collectors.toList());
		System.out.println(liste1);
		
		liste2 = zeichenkette2.chars().mapToObj((i) -> Character.valueOf((char)i)).collect(Collectors.toList());
		System.out.println(liste2);
		
	}
	{
		public static void überprüfung()
	}

}
