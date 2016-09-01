package com.edu.tinzel;

import java.util.Scanner;

public class Calculate {
	 static Scanner sc = new Scanner(System.in);
	 static int jieguo=0;
	 
	/**
	 * @param 输入的参数
	 * @param 输入符号
	 * @param 第二个参数
	 */
	public static void yunsuan(int shuru1,char fuhao,int shuru2){
		//输入公式
		switch (fuhao) {
		case '+':
			jieguo=shuru1+shuru2;
			System.out.print(shuru1+"+"+shuru2+"="+jieguo);
			break;
		case '-':
			jieguo=shuru1-shuru2;
			System.out.print(shuru1+"-"+shuru2+"="+jieguo);
			break;
		case '*':
			jieguo=shuru1*shuru2;
			System.out.print(shuru1+"*"+shuru2+"="+jieguo);
		case '/':
			jieguo=shuru1/shuru2;
			if(shuru2==0){
				System.out.println("除数不得为0");
			}
			System.out.print(shuru1+"/"+shuru2+"="+jieguo+"\t余数为："+(shuru1%shuru2));
			break;
		}
		System.out.println();
	}
	
	/**
	 * 继续运算
	 * @param 输入继续运算的符号
	 * @param 输入参与继续运算的参数
	 */
	public static void jixu(char fu,int shuru){
		
		yunsuan(jieguo,fu,shuru);
	}
	
	
	//继续运算的循环系统
	public static void m(){
		
		System.out.println("请输入：");
		//调用什么方法，传入。。。
		yunsuan(sc.nextInt(),sc.next().charAt(0),sc.nextInt());
		
		
		do{
			System.out.println("请输入：[继续运算/新的运算/退出系统]");
			String s=sc.next();
			if(s.equals("继续运算")){
				System.out.println("请输入：");
				//当继续运算时调用继续运算方法
				jixu(sc.next().charAt(0),sc.nextInt());
			}else if(s.equals("新的运算")){
				System.out.println("请重新输入：");
				yunsuan(sc.nextInt(),sc.next().charAt(0),sc.nextInt());
				System.out.println();
			}else if(s.equals("退出系统")){
				break;
			}else{
				System.out.println("请输入正确的文字");
			}
			
		}while(true);
		System.exit(0);
	}
}
