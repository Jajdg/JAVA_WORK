package com.edu.tinzel;

import java.util.Random;
import java.util.Scanner;

public class renwu_sanguosha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		=====================首页=======================
		
		System.out.println("=============欢迎来到三国杀=============");
		System.out.println("====================================================");
		System.out.println("三国杀是一款以三国题材为背景的桌游");
		System.out.println("迷你版三国杀是一款以java开发的控制台游戏程序");
		System.out.println("====================================================");
		System.out.println("————————武将列表——————————");
		
//		**********************武将信息录入********************
		
		String str[][]=new String[6][4];
		str=new String[][]{{"1","刘备","4","仁德"},{"2","赵云","4","龙胆"},{"3","曹操","4","奸雄"},{"4","夏侯惇","4","刚烈"},{"5","孙权","4","制衡"},{"6","周瑜","3","反间"}};
		for(int i=0;i<6;i++){
			System.out.println(str[i][0]+str[i][1]+"\t血量："+str[i][2]+"\t技能："+str[i][3]);
		}
		
//		**********************武将选择**********************
			
		System.out.print("请输入要选择的武将序号：");
		Scanner sc = new Scanner(System.in);
		int paly1,paly2 = 0;
		int palyblood=4;
		do{
			paly1=sc.nextInt()-1;
			if(paly1>=0&&paly1<6){
				System.out.println("您选择了"+str[paly1][1]+"进行游戏");
			}else
				System.err.println("请输入正确的序号：");
		}while(!(paly1>=0&&paly1<6));
		Random r = new Random();
		do{
		paly2=(int) (Math.random()*6);
		}while(paly1==paly2);
		System.out.println("电脑选择了"+str[paly2][1]+"进行游戏");
		System.out.println("====================================================");
//		**********************卡牌信息录入*********************
		
		String[] Card= new String[104];
		for(int i=0;i<21;i++)
			Card[i]="(黑桃)杀";
		for(int i=21;i<42;i++)
			Card[i]="(梅花)杀";
		for(int i=42;i<84;i++)
			Card[i]="(方块)闪";
		for(int i=84;i<104;i++)
			Card[i]="(红桃)桃";
		
//		for(int i=0;i<104;i++)
//			System.out.println(Card[i]);
		
//		******************发牌***************************
		String shoupai1[] = new String[4];
		String shoupai2[] = new String[4];
		System.out.println("发给玩家："+str[paly1][1]+"\t血量："+str[paly1][2]+"\t技能："+str[paly1][3]);
		int pai1[]=new int[4];
		for(int j=1;j<5;j++){
			
			 pai1[j-1]=(int) (Math.random()*104);
			shoupai1[j-1]=Card[pai1[j-1]];
			System.out.print("[卡牌"+j+"]"+shoupai1[j-1]+"\t");
		}
		System.out.println(" ");
		System.out.println("发给玩家："+str[paly2][1]+"\t血量："+str[paly2][2]+"\t技能："+str[paly2][3]);
		int[] pai2=new int[4];
		for(int j=1;j<5;j++){
			
			pai2[j-1]=(int) (Math.random()*104);
			shoupai2[j-1]=Card[pai2[j-1]];
			System.out.print("[卡牌"+j+"]"+shoupai2[j-1]+"\t");
		}
		System.out.println(" ");
		System.out.println("请输入[1,2,3,4]选择出牌(0为弃牌)：");
		
//		********************出牌***********************
		int chupai = sc.nextInt()-1;
		System.out.println("玩家出牌："+shoupai1[chupai]);
		if(shoupai1[chupai]=="(黑桃)杀"||shoupai1[chupai]=="(梅花)杀"){
			palyblood--;
			System.out.println(str[paly2][1]+"受到一点伤害，损失一滴血");
		}
		if (shoupai1[chupai]=="(方块)闪") {
			System.err.println("现在不能出“闪”");
		}
		if (shoupai1[chupai]=="(红桃)桃") {
			System.err.println("为损失血量，不能使用“桃”");
		}
	}
	
}
