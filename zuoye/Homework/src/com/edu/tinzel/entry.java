package com.edu.tinzel;

import java.util.Scanner;

public class entry {
	
	public static void entry(){
		Scanner sc = new Scanner(System.in);
		System.out.println("----------欢迎使用计算系统----------");
		System.out.println("1.注册\t2.登录\t3.退出");
		int input=sc.nextInt();
		Set(input);
	}
	
	
	static zhanghao zh = new zhanghao();
	static int cishu=0;
	//1.注册           2.登录
	/**
	 * 
	 * @param 选择[1/2/3]：1.注册     2.登录      3.退出
	 */
	public static void Set(int input){
			Scanner sc = new Scanner(System.in);
			
			//输入为1
			if(input==1){
				//注册
				System.out.println("请输入需要注册账号：");
				zh.setID(sc.next());
				System.out.println("请输入账号密码：");
				zh.setPassword(sc.next());
				System.out.println("注册完毕！");
				System.out.println("1.注册\t2.登录\t3.退出");
				input=sc.nextInt();
				Set(input);
			}
			//输入为2
			else if (input==2){
				//登录
				System.out.println("请输入登录账号：");
				String s = sc.next();
				
				//如果输入的账号存在
				if(s.equals(zh.getID())){
					System.out.println("请输入密码：");
					String s2=sc.next();
					if(s2.equals(zh.getPassword())){
						//进行运算
						System.out.println("登录成功！");
						System.out.println("欢迎使用运算程序");
						//调用计算方法
						Calculate.m();
					}else {
						System.out.println("密码输入错误！请重新输入");
						cishu++;
						if(cishu>2){
							System.out.println("密码输错三次！系统退出！");
							System.exit(0);
						}
						Set(2);			
					}
				
					
				} 
				//如果输入的账号不存在
				else{
					System.out.println("该账号未注册，请先注册！");
					System.out.println("1.注册\t2.登录\t3.退出");
					input=sc.nextInt();
					Set(input);
				}
			}
			//输入为3
			else if(input==3){
				System.exit(0);
			}
			//输入错误
			else {
				//请输入正确的数字
				System.out.println("请输入正确的数字！");
				System.out.println("1.注册\t2.登录\t3.退出");
				input=sc.nextInt();
				Set(input);
			}
			System.exit(0);
		}
}
