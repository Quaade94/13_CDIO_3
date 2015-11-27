package Game;

import java.util.Locale;
import java.util.ResourceBundle;

public class Language {
	
	//Her Opretter vi en Resource Bundle med navnet 'text', den er static så den er bedre tilgænglig i andre klasser.
	static ResourceBundle text;
	
	public static void setLocale(Locale eng){	
		
		//Resource bundle 'text' bliver difineret som vores textfil (som vi skriver vores sætningerne ind i).
		text = ResourceBundle.getBundle("MessageBundle", eng);
	}
	
	//en get-metode så vi kan kalde vores String til de andre klasser.
	public static String getLang(String keyword){
		
		//Locale beskriver vores regions sprog, tegn osv..
		//Kommandoen lyder Locale(String language, String country), her sætter vi den til typen engelsk i storbritanien.
		setLocale(new Locale("en", "GB"));
		
		return text.getString(keyword);
	}
	
}
