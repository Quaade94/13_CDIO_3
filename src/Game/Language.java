package Game;

import java.util.Locale;

public class Language {
	static ResourceBundle langs;
	public static String[] getlang(String word) {

		if(langs==null){

			setLocale(new Locale("en", "GB"));
		}
		return langs.getString(word);

	}	
}
