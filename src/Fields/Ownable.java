package Fields;



public abstract class Ownable extends Field {

	private int price;
	private int IDOfPlayer;

	public abstract  int getRent();
	
	@Override
	public abstract void landOnField(int IDOfPlayer);
	
	
	
}
