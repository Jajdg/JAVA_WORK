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
		 * ������Ķ��ٴ�
		 * ��ӡ�ظ��������ĸ�
		 */
		int n=0;
		int max=m[0];
		for(int i=1;i<=8;i++){
			if(m[i]>max){
				max=m[i];
				n=i;
			}
		}
		System.out.println("�������Ϊ"+(max+1)+"��");
		System.out.println("����������"+st[n]);
	}

}
