package TEXT;

import java.util.*;

public abstract class Character {
	private static int count ;//�佫����
	private int id;//�佫���
	private String name;//����
	private int maxhp;//�佫Ѫ������
	private String skillname;//��������
	private int hp;//�佫��ǰѪ��
	
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
		Character zhaoyun = new ShuGuoCharacter("����",4,"����",85);
		Character caocao = new WeiGuoCharacter("�ܲ�",4,"����");
		Character zhouyu = new WuGuoCharacter("���",3,"����");
		
		allCharacters.put(zhaoyun.getId(), zhaoyun);
		allCharacters.put(caocao.getId(), caocao);
		allCharacters.put(zhouyu.getId(), zhouyu);
		
		Set<Integer> allIds = allCharacters.keySet();
		Iterator it = allIds.iterator();
		while(it.hasNext()){
			Integer id =  (Integer) it.next();
			Character c = allCharacters.get(id);
			System.out.println("�佫��"+c.getName()+"��Ѫ����"+c.getHp()+"�����ܣ�"+c.getSkillname());
		}
	}
}
