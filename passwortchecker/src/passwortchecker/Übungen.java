package passwortchecker;

public class Übungen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rechnen();
	}
	static int i;
	static int j;
	static int ergebnis;
	
	public static void rechnen()
	{
	   for(int i=1; i<11; i++)
	   {
		   for(int j=1; j<11; j++)
		   {
			 ergebnis = i * j;
			 System.out.print(ergebnis + "\t");
			 System.out.println();
		   }
	   }
	   }
}
