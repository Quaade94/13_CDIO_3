package Game;

import java.util.Locale;
import java.util.ResourceBundle;

public class Language {
	
	//Her Opretter vi en Resource Bundle med navnet 'text', den er static så den er bedre tilgænglig i andre klasser.
	static ResourceBundle text;
	
	public static void setLocale(Locale eng){	
		
		//Resource bundle 'text' bliver difineret som vores textfil som hedder 'MessageBundle..
		//(som vi skriver vores sætningerne ind i).
		//Messagebundle bliver altså kaldet her
		text = ResourceBundle.getBundle("MessageBundle", eng);
		
	}
	
	//en get-metode så vi kan kalde vores String til de andre klasser.
	/**
	 * 
	 * @param keyword er et kort ord (i blokbukstaver) som man skriver ind imellem paranteterne når man kalder på metoden.
	 * Inde i message bundle skriver man så sit keyword og = 'den text der skal så', se evt eksempler i MessageBundle.
	 * @return retunere din String.
	 */
	public static String getLang(String keyword){
		
		//Locale beskriver vores regions sprog, tegn osv..
		//Kommandoen lyder Locale(String language, String country), her sætter vi den til typen engelsk i storbritanien.
		setLocale(new Locale("en", "GB"));
		
		return text.getString(keyword);
	}
	
}

//	.properties gør det muligt at åbne filen i alle text editors.