package Twenty_one;

import java.util.Scanner;

public class Head {
	
	public static void head(){
		System.out.println("*************�����ĳ�֮����ʤ21�㡱**************");
		System.out.println("*��ʼ��Ϸû�з�������");
		System.out.println("*���������Ҫ������");
		System.out.println("*���ͣ�ƺ��е���ѡ��");
		System.out.println("*A��Ϊ1�㣬����10����Ƽ�Ϊ10�㣬�����ư�ʵ�ʵ�������");
		System.out.println("*˭�ȵ�21�����ӽ�21����˭Ӯ");
		System.out.println("*ף�����ˣ�");
		System.out.println("************�ʶ���Ϸ���ԣ�������Ϸ����************");
	}
	
	static Scanner sc = new Scanner(System.in);
	public static void GameMain(String[][] card){
		System.out.println("�Ƿ����21����Ϸ[y/n]");
		char yn = sc.next().charAt(0);
		if(yn=='y')
			Game.main(card);
	}
}
