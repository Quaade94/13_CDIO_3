package Game;

import java.util.Locale;
import java.util.ResourceBundle;

public class Language {
	static ResourceBundle langs;
	public static String getLang(String word){
		if(langs==null){
			setLocale(new Locale("en", "GB"));
		}
		return langs.getString(word);
	}
	
	@Override
	public String toString() {
		return "Current locale: " + langs.getLocale() + " on the following file: " + langs.getBaseBundleName() + " where " + langs.keySet().size() + "keys are contained";
	}
	
	public static void setLocale(Locale l){	
		langs = ResourceBundle.getBundle("MessageBundle", l);
	}
	//Avoids creating objects of this class
	private Language(){
	}	
}
