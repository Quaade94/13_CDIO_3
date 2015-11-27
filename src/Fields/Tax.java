package Fields;

import Game.Language;
import desktop_resources.GUI;

public class Tax extends Field{

	private int taxAmount;
	private int konto;
	private double per = 0.1;
	private int [] rentArray = {2000,4000};
	private int playerPosition;
	private int fieldNumber;

	@Override
	public void landOnField(int IDOfPlayer){
		taxAmount = 0;
		
		if (fieldNumber == 2){
			
			boolean choice = GUI.getUserLeftButtonPressed(Language.getLang("PAY"), "10%", "4000,-");
			if (choice){
				double calculation = per * konto;
				taxAmount = (int)calculation;
			}else if (!(choice)) {
				taxAmount = rentArray[1];
			}
		} else if (fieldNumber == 1){
			taxAmount = rentArray[0];
		}
	}
	public void setTenPercent(int playerMoney){
		konto = playerMoney;
	}
	public void setFieldNumber(int taxNumber){
		fieldNumber = taxNumber;
	}
	public void setPlayerPositionTax(int playerPositionMethod) {
		playerPosition = playerPositionMethod;
	}
	public int getRent() {
		return taxAmount;
	}
}






