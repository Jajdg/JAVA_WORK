package TEXT;

import java.util.*;

public class Actor {
	//�ж�����ѡ���佫
	private Character character;
	//�洢���Ƽ���
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
	
	
	//��дObject��toString����
	public String toString(){
		return "�佫"+getCharacter().getName()+"������Ѫ���ǣ�"
				+getCharacter().getHp()+"�������ǣ�"+getCharacter().getSkillname();
	}
	
	
	//����4����
	public void giveCard(){
		if(this instanceof Player)
			System.out.println("���Ƹ���ң�"+character.getName());
		else if(this instanceof PlayerAI)
			System.out.println("���Ƹ����֣�"+character.getName());
		for(int i=0;i<4;i++){
			Card card = Initial.listcard.get(0);
			System.out.print("[����"+(i+1)+"]"+"\t");
			handcard.add(card);
			Initial.listcard.remove(0);
		}
 	}
	
	//��ʾ������Ϣ
	public void showHandCard(){
		Iterator it = handcard.iterator();
		System.out.println("\n������ϢΪ��");
		while(it.hasNext()){
			Card card = (Card) it.next();
			System.out.print (card.getColor()+card.getNum()+"["+card.getKey()+"]\t");
		}
		System.out.println();
	}
	
	//���ƣ�numΪ��������
	public void fetchCard(int num){
		giveCard(2);
	}
	
	// ϵͳ����ҷ�num����
	public void giveCard(int num) {
		System.out.print("�����"+num+"���ƺ�");
		for(int i = 0;i<num;i++){
			Card card = Initial.listcard.get(0);
			handcard.add(card);
			Initial.listcard.remove(0);
		}
	}
	
	//����������Ƿ���һЩ��ɱ����
	private boolean hasSomekill(){
		for(int i = 0;i<handcard.size();i++)
		{
			Card card = handcard.get(i);
			if(card.getKey().equals("ɱ"))
				return true;
			}
		return false;
	}
	//����������Ƿ���һЩ��������
	private boolean hasSomeShan() {
		for(int i = 0;i<handcard.size();i++)
		{
			Card card = handcard.get(i);
			if(card.getKey().equals("��"))
				return true;
			}
		return false;
	}
	//����������Ƿ���һЩ���ҡ���
	private boolean hasSomeTao() {
		for(int i = 0;i<handcard.size();i++)
		{
			Card card = handcard.get(i);
			if(card.getKey().equals("��"))
				return true;
			}
		return false;
	}
	//�����߳�ɱ
	public void sendShaCard(){
		if(hasSomekill()){
			boolean canSend = false;//�Ƿ�ɳ���
			int index = -1;
			while(!canSend){
				System.out.println(character.getName()+"������Ƶ���ţ�");
				Scanner sc = new Scanner(System.in);
				index = sc.nextInt();
				if(!handcard.get(index).getKey().equals("ɱ")){
					System.err.println("����ʱ��ɱ��ɱ��");
					continue;
				}
				canSend = true;
			}
			if(canSend && index >=0){
				Card card = handcard.get(index-1);
				System.out.println(character.getName()+"���"+card.getColor()+card.getNum()+"["+card.getKey()+"]");
				handcard.remove(card);  
			}
		}
	}
	
	//�������߳��ƣ�����������û������Ҵ��ȥ֮������һ���ƣ�ֱ�����������ƣ�
	public void sendReplyCard(){
		if(hasSomeShan()){
			System.out.println("������");
			sendShanCard();
		}
	}

	private void sendShanCard() {
		// TODO Auto-generated method stub
		boolean canSend = false ; 
		int index = -1;
		while(!canSend){
			System.out.println(character.getName()+"�������Ƶ���ţ�");
		}
	}

}
