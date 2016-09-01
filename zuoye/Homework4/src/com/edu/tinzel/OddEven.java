package com.edu.tinzel;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入数字：");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num%2==0){
			System.out.println("输入数字为偶数");
		}else{
			System.out.println("输入数字为奇数");
		}
	}

}
