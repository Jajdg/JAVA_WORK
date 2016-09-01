package StuSystem;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stu[] st = new Stu[5];
		luru lr = new luru(st);
		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i].getName());
		}
		
		int yn;
		do {
			System.out.println("-------------------------");
			System.out.println("1.显示所有学生信息");
			System.out.println("2.根据编号查询学生信息");
			System.out.println("3.根据编号修改学生年龄");
			System.out.println("4.根据姓名修改学生班级");
			System.out.println("5.根据班级查询全部学生信息");
			System.out.println("-------------------------");
			System.out.println("请选择[1/2/3/4/5]");
			Scanner sc = new Scanner(System.in);

			int input = sc.nextInt();
			switch (input) {
			case 1:
				System.out.println("-------------------------");
				System.out.println("编号\t姓名\t性别\t年龄\t班级");
				for (int i = 0; i < st.length; i++) {
					System.out.println(st[i].getID() + "\t" + st[i].getName() + "\t" + st[i].getSex() + "\t"
							+ st[i].getAge() + "\t" + st[i].getGrade());
				}
				System.out.println("-------------------------");
				break;
			case 2:
				System.out.println("请输入需要查询的学生编号：");
				input=sc.nextInt()-1;
				System.out.println("-------------------------");
				System.out.println("编号\t姓名\t性别\t年龄\t班级");			
				System.out.println(st[input].getID() + "\t" + st[input].getName() + "\t" + st[input].getSex() + "\t"
							+ st[input].getAge() + "\t" + st[input].getGrade());
				System.out.println("-------------------------");
				
				break;
			case 3:
				System.out.println("请输入需要修改的学生编号：");
				input=sc.nextInt()-1;
				System.out.println("请输入修改后的年龄：");
				st[input].setAge(sc.nextInt());
				System.out.println("修改后为");
				System.out.println("-------------------------");
				System.out.println("编号\t姓名\t性别\t年龄\t班级");			
				System.out.println(st[input].getID() + "\t" + st[input].getName() + "\t" + st[input].getSex() + "\t"
							+ st[input].getAge() + "\t" + st[input].getGrade());
				System.out.println("-------------------------");
				break;
			case 4:
				System.out.println("请输入需要修改的学生姓名：");
				String rname=sc.next();
				for (int i = 0; i < st.length; i++) {
					if(st[i].getName().equals(rname)){
						System.out.println("请输入要修改后的班级：");
						st[i].setGrade(sc.nextInt());
						System.out.println("修改后为");
						System.out.println("-------------------------");
						System.out.println("编号\t姓名\t性别\t年龄\t班级");			
						System.out.println(st[i].getID() + "\t" + st[i].getName() + "\t" + st[i].getSex() + "\t"
									+ st[i].getAge() + "\t" + st[i].getGrade());
						System.out.println("-------------------------");
						break;
					}
				}
				break;
			case 5:
				System.out.println("请输入班级：");
				int banji=sc.nextInt();
				System.out.println("-------------------------");
				for (int i = 0; i < st.length; i++) {
					if(st[i].getGrade()==banji){
						System.out.println(st[i].getID() + "\t" + st[i].getName() + "\t" + st[i].getSex() + "\t"
									+ st[i].getAge() + "\t" + st[i].getGrade());
					}
				}
				System.out.println("-------------------------");
				break;
			default:
				break;
			}
			System.out.println("是否继续[y/n]:");
			yn = sc.next().charAt(0);
		} while (yn == 'y');
		System.exit(0);
	}

}
