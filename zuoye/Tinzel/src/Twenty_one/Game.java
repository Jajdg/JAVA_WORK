package Twenty_one;

import java.util.Scanner;

public class Game {
		static Scanner sc = new Scanner(System.in);
	public static void  main(String[][] card) {
		
		System.out.println("开始发牌，庄闲各两张。。。。");
		
		int i;
		int j;
		int  score1=0;
		i=(int)(Math.random()*4); 
		j=(int)(Math.random()*13);
		String p1=Card.GetCard1(i,j);
		
		
		score1+=Card.Score(j);
		String p2;
		do{
		i=(int)(Math.random()*4); 
		j=(int)(Math.random()*13);
		p2=Card.GetCard1(i,j);
		}while(p1==p2);
		
		System.out.println("庄家："+"底牌"+"\t"+p2);
		
		int  score2=0;
		String[] p=new String[5];
		String p3;
		do {
			i = (int) (Math.random() * 4);
			j = (int) (Math.random() * 13);
			p3 = Card.GetCard1(i, j);
		} while (p1==p3||p2==p3);
		score2+=Card.Score(j);
		
		
		String p4;
		do{
		i=(int)(Math.random()*4); 
		j=(int)(Math.random()*13);
		p4=Card.GetCard1(i,j);
		}while(p1==p4||p2==p4||p3==p4);
		score2+=Card.Score(j);
		System.out.println("闲家："+p3+"\t"+p4+"\t"+"闲家点数"+score2);
		
		
		int jixu,a=0;
		String p5,p6,p7;
		
		for(;;){
		System.out.println("请选择：（1、停牌   2、要牌）");	
		jixu=sc.nextInt();
		if(jixu==2)
			do{
				i=(int)(Math.random()*4); 
				j=(int)(Math.random()*13);
				p5=Card.GetCard1(i,j);
				}while(p1==p5||p2==p5||p3==p5||p4==p5);
		else
			break;
		}
		
	}
		
}

