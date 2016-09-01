import java.util.Scanner;

public class speedmade {
	public static void main(String args[]){
		float speed,distance,time;
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入距离：");
		distance=sc.nextFloat();
		System.out.println("请输入时间：");
		time=sc.nextFloat();
		speed=distance/time;
		System.out.println("所求速度为："+speed);
	}
}
