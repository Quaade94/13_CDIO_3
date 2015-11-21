package Game;

import desktop_fields.Field;
import desktop_fields.Street;
import desktop_resources.GUI;

public class Fields {
	
	GameBoard Board = new GameBoard();

	public Fields(){
Field[] fields = new Field[21];
		
		
		fields[0] = new Street.Builder()
				.setTitle(Language.getLang("TER1"))
				.setRent(Board.getFieldRent(1)+",-")
				.setSubText(Language.getLang("PRI")+": "+Board.getFieldPrice(1))
				.build();
		
		fields[1] = new Street.Builder()
				.setTitle(Language.getLang("TER2"))
				.setRent(Board.getFieldRent(2)+",-")
				.setSubText(Language.getLang("PRI")+": "+Board.getFieldPrice(2))
				.build();
		
		fields[2] = new Street.Builder()
				.setTitle(Language.getLang("TER3"))
				.setRent(Board.getFieldRent(3)+",-")
				.setSubText(Language.getLang("PRI")+": "+Board.getFieldPrice(3))
				.build();
		
		fields[3] = new Street.Builder()
				.setTitle(Language.getLang("TER4"))
				.setRent(Board.getFieldRent(4)+",-")
				.setSubText(Language.getLang("PRI")+": "+Board.getFieldPrice(4))
				.build();
		
		fields[4] = new Street.Builder()
				.setTitle(Language.getLang("TER5"))
				.setRent(Board.getFieldRent(5)+",-")
				.setSubText(Language.getLang("PRI")+": "+Board.getFieldPrice(5))
				.build();
		
		fields[5] = new Street.Builder()
				.setTitle(Language.getLang("TER6"))
				.setRent(Board.getFieldRent(6)+",-")
				.setSubText(Language.getLang("PRI")+": "+Board.getFieldPrice(6))
				.build();
		
		fields[6] = new Street.Builder()
				.setTitle(Language.getLang("TER7"))
				.setRent(Board.getFieldRent(7)+",-")
				.setSubText(Language.getLang("PRI")+": "+Board.getFieldPrice(7))
				.build();
		
		fields[7] = new Street.Builder()
				.setTitle(Language.getLang("TER8"))
				.setRent(Board.getFieldRent(8)+",-")
				.setSubText(Language.getLang("PRI")+": "+Board.getFieldPrice(8))
				.build();
		
		fields[8] = new Street.Builder()
				.setTitle(Language.getLang("TER9"))
				.setRent(Board.getFieldRent(9)+",-")
				.setSubText(Language.getLang("PRI")+": "+Board.getFieldPrice(9))
				.build();
		
		fields[9] = new Street.Builder()
				.setTitle(Language.getLang("TER10"))
				.setRent(Board.getFieldRent(10)+",-")
				.setSubText(Language.getLang("PRI")+": "+Board.getFieldPrice(10))
				.build();
		
		fields[10] = new Street.Builder()
				.setTitle(Language.getLang("TER11"))
				.setRent(Board.getFieldRent(11)+",-")
				.setSubText(Language.getLang("PRI")+": "+Board.getFieldPrice(11))
				.build();
		
		fields[11] = new Street.Builder()
				.setTitle(Language.getLang("REF1"))
				.setRent(Board.getFieldRent(12)+",-")
				.setSubText(Language.getLang("REC")+": "+Board.getFieldPrice(12))
				.build();
		
		fields[12] = new Street.Builder()
				.setTitle(Language.getLang("REF2"))
				.setRent(Board.getFieldRent(13)+",-")
				.setSubText(Language.getLang("REC")+": "+Board.getFieldPrice(13))
				.build();
		
		fields[13] = new Street.Builder()
				.setTitle(Language.getLang("LAB1"))
				.setRent(Board.getFieldRent(14)+",-")
				.setSubText(Language.getLang("PRI")+": "+Board.getFieldPrice(14))
				.build();
		
		fields[14] = new Street.Builder()
				.setTitle(Language.getLang("LAB2"))
				.setRent(Board.getFieldRent(15)+",-")
				.setSubText(Language.getLang("PRI")+": "+Board.getFieldPrice(15))
				.build();
		
		fields[15] = new Street.Builder()
				.setTitle(Language.getLang("TAX1"))
				.setRent(Board.getFieldRent(16)+",-")
				.setSubText("PAY (not done)")
				.build();
		
		fields[16] = new Street.Builder()
				.setTitle(Language.getLang("TAX2"))
				.setRent("")
				.setSubText("4000 or 10% of total assets,-")
				.build();
		
		fields[17] = new Street.Builder()
				.setTitle(Language.getLang("FLE1"))
				.setRent(Board.getFieldRent(18)+",-")
				.setSubText(Language.getLang("PRI")+": "+Board.getFieldPrice(18))
				.build();
		
		fields[18] = new Street.Builder()
				.setTitle(Language.getLang("FLE2"))
				.setRent(Board.getFieldRent(19)+",-")
				.setSubText(Language.getLang("PRI")+": "+Board.getFieldPrice(19))
				.build();
		
		fields[19] = new Street.Builder()
				.setTitle(Language.getLang("FLE3"))
				.setRent(Board.getFieldRent(20)+",-")
				.setSubText(Language.getLang("PRI")+": "+Board.getFieldPrice(20))
				.build();
		
		fields[20] = new Street.Builder()
				.setTitle(Language.getLang("FLE4"))
				.setRent(Board.getFieldRent(21)+",-")
				.setSubText(Language.getLang("PRI")+": "+Board.getFieldPrice(21))
				.build();
		
		GUI.create(fields);
	}
}
