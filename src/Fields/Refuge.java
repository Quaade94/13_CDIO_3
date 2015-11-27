package Fields;

public class Refuge extends Field{

		private int bonus;
		private int fieldNumber;
		private int player;
		
		@Override
		public void landOnField(int IDOfPlayer){
			bonus = 0;
			player = IDOfPlayer;
			
			if (fieldNumber == 1){
				bonus = -5000;
			} else if (fieldNumber == 2){
				bonus = -500;
			}
		}
		public void setFieldNumber(int refNumber){
			fieldNumber = refNumber;
		}
		public int getBonus() {
			return bonus;
		}
	}