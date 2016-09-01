package Twenty_one;

import java.util.Scanner;

public class Head {
	
	public static void head(){
		System.out.println("*************豪华赌场之“决胜21点”**************");
		System.out.println("*开始游戏没有发两张牌");
		System.out.println("*玩家最多可以要五张牌");
		System.out.println("*玩家停牌后有电脑选牌");
		System.out.println("*A牌为1点，超过10点的牌记为10点，其他牌按实际点数计算");
		System.out.println("*谁先到21点或最接近21点算谁赢");
		System.out.println("*祝您好运！");
		System.out.println("************适度游戏益脑，沉迷游戏伤身************");
	}
	
	static Scanner sc = new Scanner(System.in);
	public static void GameMain(String[][] card){
		System.out.println("是否进行21点游戏[y/n]");
		char yn = sc.next().charAt(0);
		if(yn=='y')
			Game.main(card);
	}
}
