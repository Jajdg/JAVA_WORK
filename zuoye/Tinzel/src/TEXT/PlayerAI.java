package TEXT;

public class PlayerAI extends Actor {
	private String type="����";
	
	public PlayerAI(Character character){
		super(character);
	}
	
	public String toString(){
		return "����ѡ����"+super.toString();
	}
}
