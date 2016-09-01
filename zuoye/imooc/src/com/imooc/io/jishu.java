package com.imooc.io;

public class jishu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 100,j = 999;
		int bai,shi,ge;
		for(;i<=j;i++){
			bai = i/100;
			shi = i%100/10;
			ge = i%100%10;
			if(bai!=shi&&shi!=ge&&bai!=ge){
				System.out.println(bai*100+shi*10+ge);
			}
		}
	}

}
