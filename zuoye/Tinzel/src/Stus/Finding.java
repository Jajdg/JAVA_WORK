package Stus;

import java.util.Scanner;

public class Finding {
	

	static Scanner sc = new Scanner(System.in);
	
	/*
	 * 根据编号查询学生信息
	 */
	public static void idFinding(Stu [] stu){
		System.out.println("请输入要查询的编号：");
		int i;
		i=sc.nextInt();
		if(i<=0 || i>5){
			System.out.println("------------------------");
			System.out.println("该学生信息不存在");
			System.out.println("------------------------");
		}else{
		System.out.println("编号"+"\t"+"姓名"+"\t"+"性别"
				+"\t"+"年龄"+"\t"+"班级");
		System.out.println(stu[i-1].getId()+"\t"+stu[i-1].getName()+"\t"+
		stu[i-1].getSex()+"\t"+stu[i-1].getAge()+"\t"+stu[i-1].getGrade());
		}
	}
	
	/*
	 * 修改年龄
	 */
	
	public static void revisingAge(Stu [] stu){
		System.out.println("请输入需要修改年龄的编号：");
		int i=sc.nextInt();
		System.out.println("请输入修改后的年龄：");
		stu[i-1].setAge(sc.nextInt());
		System.out.println("修改后的信息为：");
		System.out.println("编号"+"\t"+"姓名"+"\t"+"性别"
				+"\t"+"年龄"+"\t"+"班级");
		System.out.println(stu[i-1].getId()+"\t"+stu[i-1].getName()+"\t"+
		stu[i-1].getSex()+"\t"+stu[i-1].getAge()+"\t"+stu[i-1].getGrade());
	}
	
	/*
	 * 显示所有学生信息
	 */
	
	public static void print(Stu[] stu){
		System.out.println("------------------------");
		System.out.println("编号"+"\t"+"姓名"+"\t"+"性别"
		+"\t"+"年龄"+"\t"+"班级");
		for (int i = 0; i < stu.length; i++) {
			System.out.println(stu[i].getId()+"\t"+stu[i].getName()+"\t"+
		stu[i].getSex()+"\t"+stu[i].getAge()+"\t"+stu[i].getGrade());
		}
		System.out.println("------------------------");
	}
	
	/*
	 * 修改班级
	 */
	
	public static void revisingGrade(Stu [] stu){
		System.out.println("请输入需要修改班级的姓名：");
		String name=sc.next();
		int i = 0;
		for(int j=0;j<5;j++)
			if(stu[j].getName().equals(name))
				i=j;
		
		System.out.println("请输入修改后的班级：");
		stu[i].setGrade(sc.nextInt());
		System.out.println("修改后的信息为：");
		System.out.println("编号"+"\t"+"姓名"+"\t"+"性别"
				+"\t"+"年龄"+"\t"+"班级");
		System.out.println(stu[i].getId()+"\t"+stu[i].getName()+"\t"+
		stu[i].getSex()+"\t"+stu[i].getAge()+"\t"+stu[i].getGrade());
	}
	
	/*
	 * 根据班级查询全部学生信息
	 */
	public static void findInformation(Stu [] stu){
		System.out.println("请输入需要查询的班级：");
		int i=sc.nextInt();
		System.out.println("编号"+"\t"+"姓名"+"\t"+"性别"
				+"\t"+"年龄"+"\t"+"班级");
		for(int j=0;j<5;j++)
			if(i==stu[j].getGrade()){
				System.out.println(stu[j].getId()+"\t"+stu[j].getName()+"\t"+
				stu[j].getSex()+"\t"+stu[j].getAge()+"\t"+stu[j].getGrade());
			}
	
	}
}
