import java.util.Scanner;

public class Gressing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int)( Math.random()*100);
		System.out.println("��һ�µ������ɵ�����");
		Scanner sc = new Scanner(System.in);
		do{
			int input = sc.nextInt();
			if(input>num){
				System.out.println("̫����");
			}else if(input<num){
				System.out.println("̫С��");
			}else{
				break;
			}
		}while(true);
		System.out.println("��ϲ�㣬�¶��ˣ�");
	}

}
