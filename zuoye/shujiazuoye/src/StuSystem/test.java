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
			System.out.println("1.��ʾ����ѧ����Ϣ");
			System.out.println("2.���ݱ�Ų�ѯѧ����Ϣ");
			System.out.println("3.���ݱ���޸�ѧ������");
			System.out.println("4.���������޸�ѧ���༶");
			System.out.println("5.���ݰ༶��ѯȫ��ѧ����Ϣ");
			System.out.println("-------------------------");
			System.out.println("��ѡ��[1/2/3/4/5]");
			Scanner sc = new Scanner(System.in);

			int input = sc.nextInt();
			switch (input) {
			case 1:
				System.out.println("-------------------------");
				System.out.println("���\t����\t�Ա�\t����\t�༶");
				for (int i = 0; i < st.length; i++) {
					System.out.println(st[i].getID() + "\t" + st[i].getName() + "\t" + st[i].getSex() + "\t"
							+ st[i].getAge() + "\t" + st[i].getGrade());
				}
				System.out.println("-------------------------");
				break;
			case 2:
				System.out.println("��������Ҫ��ѯ��ѧ����ţ�");
				input=sc.nextInt()-1;
				System.out.println("-------------------------");
				System.out.println("���\t����\t�Ա�\t����\t�༶");			
				System.out.println(st[input].getID() + "\t" + st[input].getName() + "\t" + st[input].getSex() + "\t"
							+ st[input].getAge() + "\t" + st[input].getGrade());
				System.out.println("-------------------------");
				
				break;
			case 3:
				System.out.println("��������Ҫ�޸ĵ�ѧ����ţ�");
				input=sc.nextInt()-1;
				System.out.println("�������޸ĺ�����䣺");
				st[input].setAge(sc.nextInt());
				System.out.println("�޸ĺ�Ϊ");
				System.out.println("-------------------------");
				System.out.println("���\t����\t�Ա�\t����\t�༶");			
				System.out.println(st[input].getID() + "\t" + st[input].getName() + "\t" + st[input].getSex() + "\t"
							+ st[input].getAge() + "\t" + st[input].getGrade());
				System.out.println("-------------------------");
				break;
			case 4:
				System.out.println("��������Ҫ�޸ĵ�ѧ��������");
				String rname=sc.next();
				for (int i = 0; i < st.length; i++) {
					if(st[i].getName().equals(rname)){
						System.out.println("������Ҫ�޸ĺ�İ༶��");
						st[i].setGrade(sc.nextInt());
						System.out.println("�޸ĺ�Ϊ");
						System.out.println("-------------------------");
						System.out.println("���\t����\t�Ա�\t����\t�༶");			
						System.out.println(st[i].getID() + "\t" + st[i].getName() + "\t" + st[i].getSex() + "\t"
									+ st[i].getAge() + "\t" + st[i].getGrade());
						System.out.println("-------------------------");
						break;
					}
				}
				break;
			case 5:
				System.out.println("������༶��");
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
			System.out.println("�Ƿ����[y/n]:");
			yn = sc.next().charAt(0);
		} while (yn == 'y');
		System.exit(0);
	}

}
