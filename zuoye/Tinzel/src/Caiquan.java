import java.util.Random;
import java.util.Scanner;

public class Caiquan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��Ϸ��ҳ
		System.out.println("-------------��ӭ�����ȭ��Ϸ---------------");
		/*
		 * ѡ������
		 */
		String[] man = {"����","����","�ŷ�","����","����","�����","����"};
		for(int k = 0 ; k < man.length ; k++)
			System.out.print(k+1+"."+man[k]+"\t");
		System.out.println();
		System.out.println("�Ƿ����ѡ������[y/n]��");
		int pole1 = 0;
		Scanner sc = new Scanner(System.in);
		
		
		char a = sc.next().charAt(0);
		boolean flag=false;
		
		if (a=='y'){
			pole1=(int) (Math.random()*7+1);//�����������
			
		}else if(a=='n'){
			System.out.println("��ѡ������Ҫʹ�õ����");	
			pole1=sc.nextInt();	
		}
		while(!flag){
			try{
				System.out.println("�����ѡ����"+man[pole1]+"������Ϸ");
				flag=true;
			} catch (Exception e) {
				// TODO: handle exception
					System.out.println("��������ȷ��������ţ�");
					pole1=sc.nextInt();	
			}
		}
		/*
		 * ��ʼ��Ϸ
		 */
		Random r = new Random();
		int pole2;
		do{
			pole2 = r.nextInt(2);
		}while(pole1==pole2);
	    System.out.println("���Խ�ʹ��"+man[pole2]+"��ʼ��Ϸ");
		String[] ps={"����","ʯͷ","��"};
		System.out.println("��ѡ��:");
		
		for(int i=0;i<=2;i++)
			System.out.print((i+1)+"."+ps[i]+"\t");
		System.out.println(" ");
		
		int m=0,n=0;
		do{
			int po1 = sc .nextInt()-1;
			int po2 = r.nextInt(2);
			System.out.println("��ѡ���� "+ps[po1]);
			System.out.println("����ѡ����"+ps[po2]);
			if(ps[po1].equals(ps[po2])){
				System.out.println("ƽ��");
			}else if(po1-po2==1){
				System.out.println("��Ӯ��");
				m++;
			}else if(po2-po1==1){
				System.out.println("������");
				n++;
			}else if(po1-po2==2){
				System.out.println("������");
				n++;
			}else if(po2-po1==2){
				System.out.println("��Ӯ��");
				m++;
			}
		}while((m<2)&&(n<2));
		if(m>=2){
			System.out.println("�����������ʤ����");
		}else if(n>=2){
			System.out.println("���Ի��������ʤ����");
		}
	}
}
