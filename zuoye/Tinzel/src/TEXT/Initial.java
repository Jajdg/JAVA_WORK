package TEXT;

import java.util.*;


public class Initial {
	
	//�������飬��104�ſ��ƣ�
	static Card[] card = new Card[104];
	//���Ƽ���
	static List<Card> listcard = new ArrayList<Card>();
	
	
	//��ʼ���佫
	static Character[] wujiang = {
			new ShuGuoCharacter("����",4,"�ʴ�",98),
			new ShuGuoCharacter("����",4,"����",85),
			new WeiGuoCharacter("�ܲ�",4,"����"),
			new WeiGuoCharacter("�ĺ",4,"����"),
			new WuGuoCharacter("��Ȩ",4,"�ƺ�"),
			new WuGuoCharacter("���",3,"����")
	};
	
	
	//���Ƴ�ʼ��
	public static void cardInit(){
		for(int i=0;i<104;i++){
			card[i] = new Card();
			if(i<42){
				card[i].setKey("ɱ");
			}else if (i<42*2){
				card[i].setKey("��");
			}else{
				card[i].setKey("��");
			}
		}
		int tmp = 0;
		for(int k=0;k<2;k++){//��������ѭ��
			for(int i=0;i<13;i++){//����ֵѭ��
				for(int j=0;j<4;j++){//��ɫѭ��
					switch(j){
					case 0:
						card[tmp].setColor("����"); 
						break;
					case 1:
						card[tmp].setColor("����");
						break;
					case 2:
						card[tmp].setColor("÷��");
						break;
					case 3:
						card[tmp].setColor("����");
						break;
					}
					switch (i) {
					case 0:
						card[tmp].setNum("A");
						break;
					case 1:
						card[tmp].setNum("2");
						break;
					case 2:
						card[tmp].setNum("3");
						break;
					case 3:
						card[tmp].setNum("4");
						break;
					case 4:
						card[tmp].setNum("5");
						break;
					case 5:
						card[tmp].setNum("6");
						break;
					case 6:
						card[tmp].setNum("7");
						break;
					case 7:
						card[tmp].setNum("8");
						break;
					case 8:
						card[tmp].setNum("9");
						break;
					case 9:
						card[tmp].setNum("10");
						break;
					case 10:
						card[tmp].setNum("J");
						break;
					case 11:
						card[tmp].setNum("Q");
						break;
					case 12:
						card[tmp].setNum("K");
						break;
					default:
						break;
					}
					listcard.add(card[tmp]);
					tmp++;
				}
			} 
		}
		
		// ϴ��
		for(int i=0;i<card.length;i++){
			Random r = new Random();
			Card cardtmp = card[i];
			listcard.remove(cardtmp);
			//indexΪ0��103֮�������
			int index = r.nextInt(listcard.size());
			listcard.add(index,cardtmp);
		}
	}
	
	
	//չʾ���Һ��������
	public static void showcard(){
		Iterator<Card> it =  listcard.iterator();
		while(it.hasNext()){
			Card card = it.next();
			System.out.println(card.getColor()+card.getNum()+"["+card.getKey()+"]");
		}
	}
	
	
	//�佫�б�
	public static void showWujiang(){
		System.out.println("�佫�б�");
		for(int i=0;i<wujiang.length;i++){
			System.out.print((i+1)+"."+wujiang[i].getName()+"��Ѫ����"+wujiang[i].getHp()+"�����ܣ�"+wujiang[i].getSkillname());
		if(wujiang[i] instanceof ShuGuoCharacter){
			//��characterת��Ϊ ��� character
			ShuGuoCharacter shuguowujiang = (ShuGuoCharacter)wujiang[i];
			System.out.print("�����壺"+shuguowujiang.getEmotion());
		}	
		System.out.println();
		}
	}
	
	
	//��ҺͶ��ֱַ�ѡ��һ���佫�������������佫��װ����ҺͶ��ֵĶ�����ȥ��Ȼ�����������ʽ������ҺͶ���
	public static Actor[] selectWujiang(){
		//�ж��߶������飨�ж�������ҺͶ��ֵĸ��ࣩ
		Actor[] actors = new Actor[2];
		
		System.out.println("\n������Ҫѡ����佫��ţ�");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		Actor player=new Player(wujiang[num-1]);
		System.out.println("���ѡ����"
				+player.getCharacter().getName()+"������Ϸ");
		System.out.println("=======================================");
		System.out.print("��������Ķ��֣����ԣ��佫��ţ�");
		num = sc.nextInt();
		Actor playerAI = new PlayerAI(wujiang[num-1]);
		System.out.println("����ѡ����"
				+playerAI.getCharacter().getName()+"������Ϸ");
		actors[0] = player;
		actors[1] = playerAI;
		return actors;
	}
}
