import java.util.Scanner;

public class Calculate {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("«Î ‰»Î:");
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		char opt=sc.next().charAt(0);
	
		if(opt=='+'){
			System.out.println(n1+n2);
		}else if(opt=='-'){
			System.out.println(n1-n2);
		}else if(opt=='*'){
			System.out.println(n1*n2);
		}else if(opt=='/'){
			System.out.println(n1/n2);
		}
	}

}
