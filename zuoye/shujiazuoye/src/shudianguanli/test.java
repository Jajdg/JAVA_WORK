package shudianguanli;

import java.util.Iterator;
import java.util.Scanner;

public class test {
	
	Scanner sc = new Scanner(System.in);
	zhanghao zh = new zhanghao();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test ts = new test();
		ts.head();
	}
	
	public void head(){
		System.out.println("	          ����������ϵͳ 		   ");
		System.out.println("---------------------------");
		System.out.println("        1.�� ¼ ϵ ͳ                          ");
		System.out.println("    	2.�� ��			   ");
		System.out.println("---------------------------");
		
		
		System.out.println("��ѡ���������֣�");
		int input = sc.nextInt();
		if(input == 1){
			System.out.println("�������˺ţ�");
			zh.setId(sc.next());
			System.out.println("���������룺");
			zh.setPassword(sc.next());
		}else{
			System.exit(0);
		}
		
		
		System.out.println("	          ����������ϵͳ 		   ");
		System.out.println("---------------------------");
		System.out.println("        1.�� Ա �� ��                          ");
		System.out.println("    	2.�� �� �� ��		   ");
		System.out.println("    	3.�� �� �� ��		   ");
		System.out.println("    	4.�� �� �� �� �� Ʒ	   ");
		System.out.println("    	5.ע ��			   ");
		System.out.println("---------------------------");
		
		
		switch (sc.nextInt()) {
		case 1:
			//��Ա����
			huiyuanguanli();
			System.out.println("����������ϵͳ>��Ա����");
			break;
		case 2:
			//�鼮����
			System.out.println("����������ϵͳ>�鼮����");
			break;
		case 3:
			//�������
			System.out.println("����������ϵͳ>�������");
			break;
		case 4:
			//���ֶһ���Ʒ
			System.out.println("����������ϵͳ>���ֶһ���Ʒ");
			break;
		case 5:
			//ע��
			System.out.println("����������ϵͳ>ע��");
			break;
		default:
			break;
		}
	}
	
	public void huiyuanguanli(){
		do{
			System.out.println("---------------------------");
			System.out.println("        1.�� ʾ �� �� �� Ա �� Ϣ       ");
			System.out.println("    	2.�� �� �� Ա �� ϵ	   ");
			System.out.println("	    3.�� �� �� Ա �� Ϣ 	   ");
			System.out.println("	    m.�� �� �� �� �� 		   ");
			System.out.println("---------------------------");
			System.out.println("��ѡ���������֣�");
			switch(sc.next().charAt(0)){
			case '1':
				System.out.println("����������ϵͳ>��Ա��Ϣ����>��ʾ��Ա��Ϣ");
				huiyuan();
				break;
			case '2':
				
				break;
			case '3':
				
				break;
			case 'm':
				return ;
			default:
				break;
			}
		}while(true);
	}  
	public void huiyuan(){
		int[][] huiyuan = new int [][]{
			{1100,18,100},{1101,24,834},{1102,13,20000},{1103,20,2938},
			{1104,22,500},{1105,22,3569},{1106,45,45},{1107,6,450}
		};
		System.out.println("\t��Ա��\t����\t����");
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < huiyuan[i].length; j++) {
				System.out.println("\t"+huiyuan[i][0]+"\t"+huiyuan[i][1]+"\t"+huiyuan[i][2]);
			}
		}
	}
}
