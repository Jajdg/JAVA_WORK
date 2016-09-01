package Stus;

import java.util.Scanner;

public class Start {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String y;
		do{
			Demo.head();
			int key=sc.nextInt();
		switch (key) {
		case 1:
			Finding.print(Demo.Information());
			break;
		case 2:
			Finding.idFinding(Demo.Information());
			break;
		case 3:
			Finding.revisingAge(Demo.Information());
			break;
		case 4:
			Finding.revisingGrade(Demo.Information());
			break;
		case 5:
			Finding.findInformation(Demo.Information());
			break;
		default:
			break;
		}
		System.out.println("ÇëÎÊÊÇ·ñ¼ÌÐø[y/n]: ");
		y=sc.next();
		}while(y.equals("y"));
		
	}

}
