package com.edu.tinzel;

import java.util.Scanner;

public class tianshu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("����ʱ��[xxxx/xx/xx]��");
		P(sc.nextInt(),sc.nextInt(),sc.nextInt());
	}
	
	/**
	 * 
	 * @param ��
	 * @param ��
	 * @param ��
	 */
	public static void P(int year,int month,int day){
		int tianshu=0;
		//�ж��Ƿ�������
		if(year%100==0){
			if(year%400==0){//��һ���������ұ��İ�����
				System.out.println("������");
				System.out.println("��һ���Ǹ���ĵ�"+(tianshu(month,day)+1)+"��");
			}else{
				System.out.println("��ƽ��");//
				System.out.println("��һ���Ǹ���ĵ�"+tianshu(month,day)+"��");
			}
		}else{
			if(year%4==0){//����һ����������������
				System.out.println("������");
				System.out.println("��һ���Ǹ���ĵ�"+(tianshu(month,day)+1)+"��");
			}else{
				System.out.println("��ƽ��");
				System.out.println("��һ���Ǹ���ĵ�"+tianshu(month,day)+"��");
			}
		}
	}
	/**
	 * 
	 * @param ��
	 * @param ��
	 * @return ���ص��������
	 */
	public static int tianshu(int month,int day){
		int tianshu=0;
		//ѭ���·�
		for(int i=1;i<month;i++){
			if(i==4||i==6||i==9||i==11){//���·�Ϊ4,6,9,11ʱ��������30
				tianshu+=30;
			}else if(i==2){//�·�Ϊ2ʱ����28��
				tianshu+=28;
			}else{//����ļ�31��
				tianshu+=31;
			}
		}
		tianshu+=day;//��������
		return tianshu;
	}
}
