package com.edu.tinzel;

import java.util.Scanner;

public class tianshu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("输入时间[xxxx/xx/xx]：");
		P(sc.nextInt(),sc.nextInt(),sc.nextInt());
	}
	
	/**
	 * 
	 * @param 年
	 * @param 月
	 * @param 日
	 */
	public static void P(int year,int month,int day){
		int tianshu=0;
		//判断是否是闰年
		if(year%100==0){
			if(year%400==0){//被一百整除，且被四百整除
				System.out.println("是闰年");
				System.out.println("这一天是该年的第"+(tianshu(month,day)+1)+"天");
			}else{
				System.out.println("是平年");//
				System.out.println("这一天是该年的第"+tianshu(month,day)+"天");
			}
		}else{
			if(year%4==0){//不被一百整除，被四整除
				System.out.println("是闰年");
				System.out.println("这一天是该年的第"+(tianshu(month,day)+1)+"天");
			}else{
				System.out.println("是平年");
				System.out.println("这一天是该年的第"+tianshu(month,day)+"天");
			}
		}
	}
	/**
	 * 
	 * @param 月
	 * @param 日
	 * @return 返回当年的天数
	 */
	public static int tianshu(int month,int day){
		int tianshu=0;
		//循环月份
		for(int i=1;i<month;i++){
			if(i==4||i==6||i==9||i==11){//当月份为4,6,9,11时，天数加30
				tianshu+=30;
			}else if(i==2){//月份为2时，加28天
				tianshu+=28;
			}else{//其余的加31天
				tianshu+=31;
			}
		}
		tianshu+=day;//加上日期
		return tianshu;
	}
}
