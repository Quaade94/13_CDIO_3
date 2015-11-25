package Game;

public class Die {

	private int dice1;
	private int dice2;
	private int sum;

	public void roll() {

			dice1 = (int) (Math.random() * 6) + 1;
			dice2 = (int) (Math.random() * 6) + 1;

			sum = dice1 + dice2;
			
//			System.out.println(sum +" " + dice1 +" "+ dice2);
	}
	
	public int getDice1(){
		
		return dice1;
	}
	public int getDice2(){
		
		return dice2;
	}	
	public int getDiceSum(){
		
		return sum;
	}
	
}
