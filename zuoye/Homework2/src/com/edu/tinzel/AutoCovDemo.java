package com.edu.tinzel;

public class AutoCovDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 10;
		int i = a;
		System.out.println("byte类型自动转换int类型："+i);
		char c='A';
		i = c;
		System.out.println("char类型自动转换int类型："+i);
		float f=i;
		System.out.println("int类型自动转换float类型："+f);
	}

}
