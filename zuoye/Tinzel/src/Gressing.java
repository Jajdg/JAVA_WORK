import java.util.Scanner;

public class Gressing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int)( Math.random()*100);
		System.out.println("猜一猜电脑生成的数字");
		Scanner sc = new Scanner(System.in);
		do{
			int input = sc.nextInt();
			if(input>num){
				System.out.println("太大了");
			}else if(input<num){
				System.out.println("太小了");
			}else{
				break;
			}
		}while(true);
		System.out.println("恭喜你，猜对了！");
	}

}
