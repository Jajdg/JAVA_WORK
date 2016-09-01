package TEXT;

import java.util.*;

public class Actor {
	//行动者能选择武将
	private Character character;
	//存储手牌集合
	private ArrayList<Card> handcard = new ArrayList<Card>();
	
	public ArrayList<Card> getHandcard(){
		return handcard;
	}
	
	public void setHandcard(ArrayList<Card> handcard){
		this.handcard=handcard;
	}
	public Actor(){
		
	}
	public Actor(Character character){
		this.character=character;
	}
	public Character getCharacter(){
		return character;
	}
	public void setCharacter(Character character){
		this.character=character;
	}
	
	
	//重写Object的toString方法
	public String toString(){
		return "武将"+getCharacter().getName()+"，他的血量是："
				+getCharacter().getHp()+"，技能是："+getCharacter().getSkillname();
	}
	
	
	//初发4张牌
	public void giveCard(){
		if(this instanceof Player)
			System.out.println("发牌给玩家："+character.getName());
		else if(this instanceof PlayerAI)
			System.out.println("发牌给对手："+character.getName());
		for(int i=0;i<4;i++){
			Card card = Initial.listcard.get(0);
			System.out.print("[手牌"+(i+1)+"]"+"\t");
			handcard.add(card);
			Initial.listcard.remove(0);
		}
 	}
	
	//显示手牌信息
	public void showHandCard(){
		Iterator it = handcard.iterator();
		System.out.println("\n手牌信息为：");
		while(it.hasNext()){
			Card card = (Card) it.next();
			System.out.print (card.getColor()+card.getNum()+"["+card.getKey()+"]\t");
		}
		System.out.println();
	}
	
	//摸牌，num为摸牌数量
	public void fetchCard(int num){
		giveCard(2);
	}
	
	// 系统给玩家发num张牌
	public void giveCard(int num) {
		System.out.print("玩家摸"+num+"张牌后，");
		for(int i = 0;i<num;i++){
			Card card = Initial.listcard.get(0);
			handcard.add(card);
			Initial.listcard.remove(0);
		}
	}
	
	//检查手牌中是否有一些“杀”牌
	private boolean hasSomekill(){
		for(int i = 0;i<handcard.size();i++)
		{
			Card card = handcard.get(i);
			if(card.getKey().equals("杀"))
				return true;
			}
		return false;
	}
	//检查手牌中是否有一些“闪”牌
	private boolean hasSomeShan() {
		for(int i = 0;i<handcard.size();i++)
		{
			Card card = handcard.get(i);
			if(card.getKey().equals("闪"))
				return true;
			}
		return false;
	}
	//检查手牌中是否有一些“桃”牌
	private boolean hasSomeTao() {
		for(int i = 0;i<handcard.size();i++)
		{
			Card card = handcard.get(i);
			if(card.getKey().equals("桃"))
				return true;
			}
		return false;
	}
	//攻击者出杀
	public void sendShaCard(){
		if(hasSomekill()){
			boolean canSend = false;//是否可出牌
			int index = -1;
			while(!canSend){
				System.out.println(character.getName()+"输入出牌的序号：");
				Scanner sc = new Scanner(System.in);
				index = sc.nextInt();
				if(!handcard.get(index).getKey().equals("杀")){
					System.err.println("攻击时有杀出杀：");
					continue;
				}
				canSend = true;
			}
			if(canSend && index >=0){
				Card card = handcard.get(index-1);
				System.out.println(character.getName()+"打出"+card.getColor()+card.getNum()+"["+card.getKey()+"]");
				handcard.remove(card);  
			}
		}
	}
	
	//被攻击者出牌（有闪出闪，没闪则把桃打出去之后再摸一张牌，直至手上有闪牌）
	public void sendReplyCard(){
		if(hasSomeShan()){
			System.out.println("有闪牌");
			sendShanCard();
		}
	}

	private void sendShanCard() {
		// TODO Auto-generated method stub
		boolean canSend = false ; 
		int index = -1;
		while(!canSend){
			System.out.println(character.getName()+"输入闪牌的序号：");
		}
	}

}
