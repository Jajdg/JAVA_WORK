package Stus;

public class Demo {
	
	
	public static void head(){
	System.out.println("-------------------------");
	System.out.println("1����ʾ����ѧ����Ϣ");
	System.out.println("2�����ݱ�Ų�ѯѧ����Ϣ");
	System.out.println("3�����ݱ���޸�ѧ������");
	System.out.println("4�����������޸�ѧ���༶");
	System.out.println("5�����ݰ༶��ѯȫ��ѧ����Ϣ");
	System.out.println("-------------------------");
	System.out.println("��ѡ��[1/2/3/4/5]");
	}
	
	
	public static Stu[] Information() {
		Stu  stu1=new Stu();
		stu1.setAge(20);
		stu1.setGrade(11301);
		stu1.setId(1);
		stu1.setName("����");
		stu1.setSex('��');
		
		Stu  stu2=new Stu();
		stu2.setAge(21);
		stu2.setGrade(11302);
		stu2.setId(2);
		stu2.setName("����");
		stu2.setSex('��');
		
		Stu  stu3=new Stu();
		stu3.setAge(20);
		stu3.setGrade(11301);
		stu3.setId(3);
		stu3.setName("����");
		stu3.setSex('��');
		
		Stu  stu4=new Stu();
		stu4.setAge(19);
		stu4.setGrade(11301);
		stu4.setId(4);
		stu4.setName("����");
		stu4.setSex('��');
		
		Stu  stu5=new Stu();
		stu5.setAge(18);
		stu5.setGrade(11301);
		stu5.setId(5);
		stu5.setName("����");
		stu5.setSex('��');

		Stu [] stu=new Stu[5];
		stu[0]=stu1;
		stu[1]=stu2;
		stu[2]=stu3;
		stu[3]=stu4;
		stu[4]=stu5;
		
		return stu;
	}
}


