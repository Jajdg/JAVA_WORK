package TEXT;

public class Player extends Actor {
	private String type = "���";//��ɫΪ���
	
	public Player(Character character){
		super(character);
	}
	public String toString(){
		return "���ѡ����"+super.toString();
	}
	
}
