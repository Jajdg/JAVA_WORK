package com.edu.tinzel;

import java.util.Scanner;

public class sushu {
	/**
	 * 
	 * @param 参与判断的数
	 * @return 如果是素数，返回true，如果不是，返回false
	 */
	public static boolean sushu1(int i){
		for(int a=2;a<i;a++){
			if(i%a==0){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args){
		System.out.println("判断开始");
		System.out.println("输入范围左值");
		Scanner sc = new Scanner(System.in);
		//输入左范围
		int shu1=sc.nextInt();
		System.out.println("输入范围右值");
		//输入右范围
		int shu2=sc.nextInt();
		//从shu1到shu2均参与判断
		for(;shu1<=shu2;shu1++){
			//如果是素数，打印
			if(sushu1(shu1))
				System.out.println(shu1);;
		}
	}
}


