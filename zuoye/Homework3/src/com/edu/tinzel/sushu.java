package com.edu.tinzel;

import java.util.Scanner;

public class sushu {
	/**
	 * 
	 * @param �����жϵ���
	 * @return ���������������true��������ǣ�����false
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
		System.out.println("�жϿ�ʼ");
		System.out.println("���뷶Χ��ֵ");
		Scanner sc = new Scanner(System.in);
		//������Χ
		int shu1=sc.nextInt();
		System.out.println("���뷶Χ��ֵ");
		//�����ҷ�Χ
		int shu2=sc.nextInt();
		//��shu1��shu2�������ж�
		for(;shu1<=shu2;shu1++){
			//�������������ӡ
			if(sushu1(shu1))
				System.out.println(shu1);;
		}
	}
}


