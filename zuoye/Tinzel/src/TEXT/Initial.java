package TEXT;

import java.util.*;


public class Initial {
	
	//卡牌数组，共104张卡牌；
	static Card[] card = new Card[104];
	//卡牌集合
	static List<Card> listcard = new ArrayList<Card>();
	
	
	//初始化武将
	static Character[] wujiang = {
			new ShuGuoCharacter("刘备",4,"仁慈",98),
			new ShuGuoCharacter("赵云",4,"龙胆",85),
			new WeiGuoCharacter("曹操",4,"奸雄"),
			new WeiGuoCharacter("夏侯惇",4,"刚烈"),
			new WuGuoCharacter("孙权",4,"制衡"),
			new WuGuoCharacter("周瑜",3,"反间")
	};
	
	
	//卡牌初始化
	public static void cardInit(){
		for(int i=0;i<104;i++){
			card[i] = new Card();
			if(i<42){
				card[i].setKey("杀");
			}else if (i<42*2){
				card[i].setKey("闪");
			}else{
				card[i].setKey("桃");
			}
		}
		int tmp = 0;
		for(int k=0;k<2;k++){//两副卡牌循环
			for(int i=0;i<13;i++){//牌面值循环
				for(int j=0;j<4;j++){//花色循环
					switch(j){
					case 0:
						card[tmp].setColor("黑桃"); 
						break;
					case 1:
						card[tmp].setColor("红桃");
						break;
					case 2:
						card[tmp].setColor("梅花");
						break;
					case 3:
						card[tmp].setColor("方块");
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
		
		// 洗牌
		for(int i=0;i<card.length;i++){
			Random r = new Random();
			Card cardtmp = card[i];
			listcard.remove(cardtmp);
			//index为0至103之间的整数
			int index = r.nextInt(listcard.size());
			listcard.add(index,cardtmp);
		}
	}
	
	
	//展示打乱后的两副牌
	public static void showcard(){
		Iterator<Card> it =  listcard.iterator();
		while(it.hasNext()){
			Card card = it.next();
			System.out.println(card.getColor()+card.getNum()+"["+card.getKey()+"]");
		}
	}
	
	
	//武将列表
	public static void showWujiang(){
		System.out.println("武将列表：");
		for(int i=0;i<wujiang.length;i++){
			System.out.print((i+1)+"."+wujiang[i].getName()+"，血量："+wujiang[i].getHp()+"，技能："+wujiang[i].getSkillname());
		if(wujiang[i] instanceof ShuGuoCharacter){
			//将character转化为 蜀国 character
			ShuGuoCharacter shuguowujiang = (ShuGuoCharacter)wujiang[i];
			System.out.print("，情义："+shuguowujiang.getEmotion());
		}	
		System.out.println();
		}
	}
	
	
	//玩家和对手分别选择一个武将，并把这两个武将封装到玩家和对手的对象中去，然后以数组的形式返回玩家和对手
	public static Actor[] selectWujiang(){
		//行动者对象数组（行动者是玩家和对手的父类）
		Actor[] actors = new Actor[2];
		
		System.out.println("\n请输入要选择的武将序号：");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		Actor player=new Player(wujiang[num-1]);
		System.out.println("玩家选择了"
				+player.getCharacter().getName()+"进行游戏");
		System.out.println("=======================================");
		System.out.print("请输入你的对手（电脑）武将序号：");
		num = sc.nextInt();
		Actor playerAI = new PlayerAI(wujiang[num-1]);
		System.out.println("对手选择了"
				+playerAI.getCharacter().getName()+"进行游戏");
		actors[0] = player;
		actors[1] = playerAI;
		return actors;
	}
}
