package TEXT;

import java.util.*;

public abstract class Character {
	private static int count ;//武将数量
	private int id;//武将编号
	private String name;//名字
	private int maxhp;//武将血量上限
	private String skillname;//技能名称
	private int hp;//武将当前血量
	
	public abstract void fight();
	
	public Character(){
		
	}
	
	public Character(String name,int maxhp,String skillname){
		this.name=name;
		this.maxhp=maxhp;
		this.skillname=skillname;
		this.hp=maxhp;
		count++;
		id = count;
	}
	public int getId(){
		return id;
	}
	public int getHp(){
		return hp;
	}
	public void setHp(int hp){
		this.hp=hp;
	}
	public int getMaxhp(){
		return hp;
	}
	public void setMaxhp(int maxhp){
		this.maxhp=maxhp;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getSkillname() {
		return skillname;
	}
	public void setSkillname(String skillname){
		this.skillname=skillname;
	}
	
	
	
	public static void main(){
		Map<Integer,Character> allCharacters = new HashMap<Integer,Character>();
		Character zhaoyun = new ShuGuoCharacter("赵云",4,"龙胆",85);
		Character caocao = new WeiGuoCharacter("曹操",4,"奸雄");
		Character zhouyu = new WuGuoCharacter("周瑜",3,"反间");
		
		allCharacters.put(zhaoyun.getId(), zhaoyun);
		allCharacters.put(caocao.getId(), caocao);
		allCharacters.put(zhouyu.getId(), zhouyu);
		
		Set<Integer> allIds = allCharacters.keySet();
		Iterator it = allIds.iterator();
		while(it.hasNext()){
			Integer id =  (Integer) it.next();
			Character c = allCharacters.get(id);
			System.out.println("武将："+c.getName()+"，血量："+c.getHp()+"，技能："+c.getSkillname());
		}
	}
}
