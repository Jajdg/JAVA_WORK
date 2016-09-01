package TEXT;

public class WuGuoCharacter extends Character {
	public WuGuoCharacter(String name,int maxhp,String skillname){
		super(name,maxhp,skillname);
	}
	@Override
	public void fight() {
		// TODO Auto-generated method stub
		System.err.println(getName()+"¾ÝÊØ½­¶«");
	}

}
