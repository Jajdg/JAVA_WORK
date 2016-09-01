import java.util.Scanner;

public class Jiecheng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i=sc.nextInt();
		int m=i;
		do{
			i=i*(m-1);
			m--;
		}while(m>=2);
		System.out.println(i);
	}

}
