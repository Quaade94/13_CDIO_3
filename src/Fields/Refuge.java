package Fields;

public class Refuge extends Field{

		private int bonus;
		private int [] bonusArray = {5000,500};
		
		@Override
		public void landOnField(int IDOfPlayer){
			
			bonus = 0;

			if (Player.getPlayerPosition(IDOfPlayer) == 11){
				
				bonus = bonusArray[0];
				
			}

			else if (Player.getPlayerPosition(IDOfPlayer) == 12){

				bonus = bonusArray[1];



			}
		}

		public int getBonus() {

			return bonus;

		}
		
		
	}
	
	
	
	

