package com.edu.tinzel;

import java.util.Scanner;

public class entry {
	
	public static void entry(){
		Scanner sc = new Scanner(System.in);
		System.out.println("----------��ӭʹ�ü���ϵͳ----------");
		System.out.println("1.ע��\t2.��¼\t3.�˳�");
		int input=sc.nextInt();
		Set(input);
	}
	
	
	static zhanghao zh = new zhanghao();
	static int cishu=0;
	//1.ע��           2.��¼
	/**
	 * 
	 * @param ѡ��[1/2/3]��1.ע��     2.��¼      3.�˳�
	 */
	public static void Set(int input){
			Scanner sc = new Scanner(System.in);
			
			//����Ϊ1
			if(input==1){
				//ע��
				System.out.println("��������Ҫע���˺ţ�");
				zh.setID(sc.next());
				System.out.println("�������˺����룺");
				zh.setPassword(sc.next());
				System.out.println("ע����ϣ�");
				System.out.println("1.ע��\t2.��¼\t3.�˳�");
				input=sc.nextInt();
				Set(input);
			}
			//����Ϊ2
			else if (input==2){
				//��¼
				System.out.println("�������¼�˺ţ�");
				String s = sc.next();
				
				//���������˺Ŵ���
				if(s.equals(zh.getID())){
					System.out.println("���������룺");
					String s2=sc.next();
					if(s2.equals(zh.getPassword())){
						//��������
						System.out.println("��¼�ɹ���");
						System.out.println("��ӭʹ���������");
						//���ü��㷽��
						Calculate.m();
					}else {
						System.out.println("���������������������");
						cishu++;
						if(cishu>2){
							System.out.println("����������Σ�ϵͳ�˳���");
							System.exit(0);
						}
						Set(2);			
					}
				
					
				} 
				//���������˺Ų�����
				else{
					System.out.println("���˺�δע�ᣬ����ע�ᣡ");
					System.out.println("1.ע��\t2.��¼\t3.�˳�");
					input=sc.nextInt();
					Set(input);
				}
			}
			//����Ϊ3
			else if(input==3){
				System.exit(0);
			}
			//�������
			else {
				//��������ȷ������
				System.out.println("��������ȷ�����֣�");
				System.out.println("1.ע��\t2.��¼\t3.�˳�");
				input=sc.nextInt();
				Set(input);
			}
			System.exit(0);
		}
}
