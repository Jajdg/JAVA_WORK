package Stus;

import java.util.Scanner;

public class Finding {
	

	static Scanner sc = new Scanner(System.in);
	
	/*
	 * ���ݱ�Ų�ѯѧ����Ϣ
	 */
	public static void idFinding(Stu [] stu){
		System.out.println("������Ҫ��ѯ�ı�ţ�");
		int i;
		i=sc.nextInt();
		if(i<=0 || i>5){
			System.out.println("------------------------");
			System.out.println("��ѧ����Ϣ������");
			System.out.println("------------------------");
		}else{
		System.out.println("���"+"\t"+"����"+"\t"+"�Ա�"
				+"\t"+"����"+"\t"+"�༶");
		System.out.println(stu[i-1].getId()+"\t"+stu[i-1].getName()+"\t"+
		stu[i-1].getSex()+"\t"+stu[i-1].getAge()+"\t"+stu[i-1].getGrade());
		}
	}
	
	/*
	 * �޸�����
	 */
	
	public static void revisingAge(Stu [] stu){
		System.out.println("��������Ҫ�޸�����ı�ţ�");
		int i=sc.nextInt();
		System.out.println("�������޸ĺ�����䣺");
		stu[i-1].setAge(sc.nextInt());
		System.out.println("�޸ĺ����ϢΪ��");
		System.out.println("���"+"\t"+"����"+"\t"+"�Ա�"
				+"\t"+"����"+"\t"+"�༶");
		System.out.println(stu[i-1].getId()+"\t"+stu[i-1].getName()+"\t"+
		stu[i-1].getSex()+"\t"+stu[i-1].getAge()+"\t"+stu[i-1].getGrade());
	}
	
	/*
	 * ��ʾ����ѧ����Ϣ
	 */
	
	public static void print(Stu[] stu){
		System.out.println("------------------------");
		System.out.println("���"+"\t"+"����"+"\t"+"�Ա�"
		+"\t"+"����"+"\t"+"�༶");
		for (int i = 0; i < stu.length; i++) {
			System.out.println(stu[i].getId()+"\t"+stu[i].getName()+"\t"+
		stu[i].getSex()+"\t"+stu[i].getAge()+"\t"+stu[i].getGrade());
		}
		System.out.println("------------------------");
	}
	
	/*
	 * �޸İ༶
	 */
	
	public static void revisingGrade(Stu [] stu){
		System.out.println("��������Ҫ�޸İ༶��������");
		String name=sc.next();
		int i = 0;
		for(int j=0;j<5;j++)
			if(stu[j].getName().equals(name))
				i=j;
		
		System.out.println("�������޸ĺ�İ༶��");
		stu[i].setGrade(sc.nextInt());
		System.out.println("�޸ĺ����ϢΪ��");
		System.out.println("���"+"\t"+"����"+"\t"+"�Ա�"
				+"\t"+"����"+"\t"+"�༶");
		System.out.println(stu[i].getId()+"\t"+stu[i].getName()+"\t"+
		stu[i].getSex()+"\t"+stu[i].getAge()+"\t"+stu[i].getGrade());
	}
	
	/*
	 * ���ݰ༶��ѯȫ��ѧ����Ϣ
	 */
	public static void findInformation(Stu [] stu){
		System.out.println("��������Ҫ��ѯ�İ༶��");
		int i=sc.nextInt();
		System.out.println("���"+"\t"+"����"+"\t"+"�Ա�"
				+"\t"+"����"+"\t"+"�༶");
		for(int j=0;j<5;j++)
			if(i==stu[j].getGrade()){
				System.out.println(stu[j].getId()+"\t"+stu[j].getName()+"\t"+
				stu[j].getSex()+"\t"+stu[j].getAge()+"\t"+stu[j].getGrade());
			}
	
	}
}
