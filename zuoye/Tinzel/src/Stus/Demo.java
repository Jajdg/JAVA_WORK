package Stus;

public class Demo {
	
	
	public static void head(){
	System.out.println("-------------------------");
	System.out.println("1、显示所有学生信息");
	System.out.println("2、根据编号查询学生信息");
	System.out.println("3、根据编号修改学生年龄");
	System.out.println("4、根据姓名修改学生班级");
	System.out.println("5、根据班级查询全部学生信息");
	System.out.println("-------------------------");
	System.out.println("请选择[1/2/3/4/5]");
	}
	
	
	public static Stu[] Information() {
		Stu  stu1=new Stu();
		stu1.setAge(20);
		stu1.setGrade(11301);
		stu1.setId(1);
		stu1.setName("张三");
		stu1.setSex('男');
		
		Stu  stu2=new Stu();
		stu2.setAge(21);
		stu2.setGrade(11302);
		stu2.setId(2);
		stu2.setName("李四");
		stu2.setSex('男');
		
		Stu  stu3=new Stu();
		stu3.setAge(20);
		stu3.setGrade(11301);
		stu3.setId(3);
		stu3.setName("王五");
		stu3.setSex('男');
		
		Stu  stu4=new Stu();
		stu4.setAge(19);
		stu4.setGrade(11301);
		stu4.setId(4);
		stu4.setName("麻六");
		stu4.setSex('男');
		
		Stu  stu5=new Stu();
		stu5.setAge(18);
		stu5.setGrade(11301);
		stu5.setId(5);
		stu5.setName("赵七");
		stu5.setSex('男');

		Stu [] stu=new Stu[5];
		stu[0]=stu1;
		stu[1]=stu2;
		stu[2]=stu3;
		stu[3]=stu4;
		stu[4]=stu5;
		
		return stu;
	}
}


