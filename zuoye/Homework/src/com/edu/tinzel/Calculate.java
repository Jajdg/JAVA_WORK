package com.edu.tinzel;

import java.util.Scanner;

public class Calculate {
	 static Scanner sc = new Scanner(System.in);
	 static int jieguo=0;
	 
	/**
	 * @param ����Ĳ���
	 * @param �������
	 * @param �ڶ�������
	 */
	public static void yunsuan(int shuru1,char fuhao,int shuru2){
		//���빫ʽ
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
				System.out.println("��������Ϊ0");
			}
			System.out.print(shuru1+"/"+shuru2+"="+jieguo+"\t����Ϊ��"+(shuru1%shuru2));
			break;
		}
		System.out.println();
	}
	
	/**
	 * ��������
	 * @param �����������ķ���
	 * @param ��������������Ĳ���
	 */
	public static void jixu(char fu,int shuru){
		
		yunsuan(jieguo,fu,shuru);
	}
	
	
	//���������ѭ��ϵͳ
	public static void m(){
		
		System.out.println("�����룺");
		//����ʲô���������롣����
		yunsuan(sc.nextInt(),sc.next().charAt(0),sc.nextInt());
		
		
		do{
			System.out.println("�����룺[��������/�µ�����/�˳�ϵͳ]");
			String s=sc.next();
			if(s.equals("��������")){
				System.out.println("�����룺");
				//����������ʱ���ü������㷽��
				jixu(sc.next().charAt(0),sc.nextInt());
			}else if(s.equals("�µ�����")){
				System.out.println("���������룺");
				yunsuan(sc.nextInt(),sc.next().charAt(0),sc.nextInt());
				System.out.println();
			}else if(s.equals("�˳�ϵͳ")){
				break;
			}else{
				System.out.println("��������ȷ������");
			}
			
		}while(true);
		System.exit(0);
	}
}
