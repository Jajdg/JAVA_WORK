import java.util.Scanner;

public class speedmade {
	public static void main(String args[]){
		float speed,distance,time;
		Scanner sc=new Scanner(System.in);
		System.out.println("��������룺");
		distance=sc.nextFloat();
		System.out.println("������ʱ�䣺");
		time=sc.nextFloat();
		speed=distance/time;
		System.out.println("�����ٶ�Ϊ��"+speed);
	}
}
