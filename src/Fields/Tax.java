package Fields;

import desktop_resources.GUI;

public class Tax extends Field{

	private int taxAmount;
	private int taxRate = -1;
	private int uDifineretKonto = 1000;
	private double per = 0.1;
	private int [] rentArray = {2000,4000,((int)(per*uDifineretKonto))};

	@Override
	public void landOnField(int IDOfPlayer){
		
		taxAmount = 0;

		if (Player.getPlayerPosition(IDOfPlayer) == 16){

			//Ser ud til at knappen ikke laver en true eller false boolean alligvel.. -Lars
			GUI.getUserLeftButtonPressed("GUI_TAX_DES", "10%", "4000,-");

			if (true){
				// Dette skal ganges med de penge som brugeren som har tur ejer.
				taxAmount = rentArray[2];
			}

			else if (false) {
				taxAmount = rentArray[1];
			}
		}

		else if (Player.getPlayerPosition(IDOfPlayer) == 15){

			taxAmount = rentArray[0];



		}
	}

	public int getRent() {

		return taxAmount;

	}
}






