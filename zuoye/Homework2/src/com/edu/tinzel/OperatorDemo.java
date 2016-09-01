package com.edu.tinzel;

public class OperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1+2;
		System.out.println("1+2="+i);
		String str="a"+"b"+"="+"ab";
		System.out.println("字符串str="+str);
		System.out.println("i-10="+(i-10));
		int m=10*10;
		System.out.println("10*10="+m);
		int k=3/10;
		System.out.println("3/10="+k);
		int n=10%4;
		System.out.println("10%4="+n);
		
		i=3;
		int t=5;
		int j=i+++5;
		m=++t+i;
		System.out.println("j="+j+",m="+m);
		
		byte b = 12;
		i=10;
		double d=10;//类型不匹配，先将10转换成10.0后赋值
		int l;
		j=k=l=5;
		System.out.println("b="+b+",i="+i+",d="+d+",j="+j+",k="+k+",l="+l);
	}

}
