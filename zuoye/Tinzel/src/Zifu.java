import java.util.Scanner;

public class Zifu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] st = {"1","3","4","7","2","4","1","5","2"};
		/*Scanner sc = new Scanner(System.in);
		for(int i=0;i<=8;i++)
			st[i]=sc.nextLine();*/
		int m[]={0,0,0,0,0,0,0,0,0};
		for(int i=0;i<=8;i++){
			for(int j=i+1;j<=8;j++){
				if(st[i].equals(st[j])){
					m[i]++;
				}
			}
		}
		/*
		 * 输出最多的多少次
		 * 打印重复最多的是哪个
		 */
		int n=0;
		int max=m[0];
		for(int i=1;i<=8;i++){
			if(m[i]>max){
				max=m[i];
				n=i;
			}
		}
		System.out.println("出现最多为"+(max+1)+"次");
		System.out.println("出现最多的是"+st[n]);
	}

}
