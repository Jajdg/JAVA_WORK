package com.edu.tinzel;

import java.util.Random;
import java.util.Scanner;

public class renwu_sanguosha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		=====================��ҳ=======================
		
		System.out.println("=============��ӭ��������ɱ=============");
		System.out.println("====================================================");
		System.out.println("����ɱ��һ�����������Ϊ����������");
		System.out.println("���������ɱ��һ����java�����Ŀ���̨��Ϸ����");
		System.out.println("====================================================");
		System.out.println("�����������������佫�б�������������������");
		
//		**********************�佫��Ϣ¼��********************
		
		String str[][]=new String[6][4];
		str=new String[][]{{"1","����","4","�ʵ�"},{"2","����","4","����"},{"3","�ܲ�","4","����"},{"4","�ĺ","4","����"},{"5","��Ȩ","4","�ƺ�"},{"6","���","3","����"}};
		for(int i=0;i<6;i++){
			System.out.println(str[i][0]+str[i][1]+"\tѪ����"+str[i][2]+"\t���ܣ�"+str[i][3]);
		}
		
//		**********************�佫ѡ��**********************
			
		System.out.print("������Ҫѡ����佫��ţ�");
		Scanner sc = new Scanner(System.in);
		int paly1,paly2 = 0;
		int palyblood=4;
		do{
			paly1=sc.nextInt()-1;
			if(paly1>=0&&paly1<6){
				System.out.println("��ѡ����"+str[paly1][1]+"������Ϸ");
			}else
				System.err.println("��������ȷ����ţ�");
		}while(!(paly1>=0&&paly1<6));
		Random r = new Random();
		do{
		paly2=(int) (Math.random()*6);
		}while(paly1==paly2);
		System.out.println("����ѡ����"+str[paly2][1]+"������Ϸ");
		System.out.println("====================================================");
//		**********************������Ϣ¼��*********************
		
		String[] Card= new String[104];
		for(int i=0;i<21;i++)
			Card[i]="(����)ɱ";
		for(int i=21;i<42;i++)
			Card[i]="(÷��)ɱ";
		for(int i=42;i<84;i++)
			Card[i]="(����)��";
		for(int i=84;i<104;i++)
			Card[i]="(����)��";
		
//		for(int i=0;i<104;i++)
//			System.out.println(Card[i]);
		
//		******************����***************************
		String shoupai1[] = new String[4];
		String shoupai2[] = new String[4];
		System.out.println("������ң�"+str[paly1][1]+"\tѪ����"+str[paly1][2]+"\t���ܣ�"+str[paly1][3]);
		int pai1[]=new int[4];
		for(int j=1;j<5;j++){
			
			 pai1[j-1]=(int) (Math.random()*104);
			shoupai1[j-1]=Card[pai1[j-1]];
			System.out.print("[����"+j+"]"+shoupai1[j-1]+"\t");
		}
		System.out.println(" ");
		System.out.println("������ң�"+str[paly2][1]+"\tѪ����"+str[paly2][2]+"\t���ܣ�"+str[paly2][3]);
		int[] pai2=new int[4];
		for(int j=1;j<5;j++){
			
			pai2[j-1]=(int) (Math.random()*104);
			shoupai2[j-1]=Card[pai2[j-1]];
			System.out.print("[����"+j+"]"+shoupai2[j-1]+"\t");
		}
		System.out.println(" ");
		System.out.println("������[1,2,3,4]ѡ�����(0Ϊ����)��");
		
//		********************����***********************
		int chupai = sc.nextInt()-1;
		System.out.println("��ҳ��ƣ�"+shoupai1[chupai]);
		if(shoupai1[chupai]=="(����)ɱ"||shoupai1[chupai]=="(÷��)ɱ"){
			palyblood--;
			System.out.println(str[paly2][1]+"�ܵ�һ���˺�����ʧһ��Ѫ");
		}
		if (shoupai1[chupai]=="(����)��") {
			System.err.println("���ڲ��ܳ�������");
		}
		if (shoupai1[chupai]=="(����)��") {
			System.err.println("Ϊ��ʧѪ��������ʹ�á��ҡ�");
		}
	}
	
}
