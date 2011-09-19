/*
 * Et palindrom er en streng som ser likedan ut både forlengs og baklengs. Skriv et program som sjekker om en streng er et palindrom ved hjelp av rekursjon. 
 * Hint: skriv en funksjon som reverserer strengen: public static String reverse(String value, String rev) Den reverserte strengen returneres.
 */
public class Task4 {

	private static String txt = "AaaBaa";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("The string \"" + txt +"\" is a palindrome: " + stringCheck(txt.toLowerCase()));
	}
	
	private static Boolean stringCheck(String _txt){
		System.out.println(_txt.substring(0, _txt.length())+" | "+_txt.length());
		if(_txt.endsWith(_txt.substring(0, 1))){
			if(_txt.length() <=2)
				return true;
			else {
				return stringCheck(_txt.substring(1, _txt.length()-1));
			}
		}
		else return false;
	}
}
