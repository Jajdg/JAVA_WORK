import java.util.Random;
import java.util.Scanner;

public class Caiquan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//游戏首页
		System.out.println("-------------欢迎进入猜拳游戏---------------");
		/*
		 * 选择人物
		 */
		String[] man = {"刘备","关羽","张飞","赵云","黄忠","诸葛亮","吕布"};
		for(int k = 0 ; k < man.length ; k++)
			System.out.print(k+1+"."+man[k]+"\t");
		System.out.println();
		System.out.println("是否随机选择人物[y/n]：");
		int pole1 = 0;
		Scanner sc = new Scanner(System.in);
		
		
		char a = sc.next().charAt(0);
		boolean flag=false;
		
		if (a=='y'){
			pole1=(int) (Math.random()*7+1);//随机产生人物
			
		}else if(a=='n'){
			System.out.println("请选择你想要使用的人物：");	
			pole1=sc.nextInt();	
		}
		while(!flag){
			try{
				System.out.println("你随机选择了"+man[pole1]+"进行游戏");
				flag=true;
			} catch (Exception e) {
				// TODO: handle exception
					System.out.println("请输入正确的任务序号：");
					pole1=sc.nextInt();	
			}
		}
		/*
		 * 开始游戏
		 */
		Random r = new Random();
		int pole2;
		do{
			pole2 = r.nextInt(2);
		}while(pole1==pole2);
	    System.out.println("电脑将使用"+man[pole2]+"开始游戏");
		String[] ps={"剪刀","石头","布"};
		System.out.println("您选择:");
		
		for(int i=0;i<=2;i++)
			System.out.print((i+1)+"."+ps[i]+"\t");
		System.out.println(" ");
		
		int m=0,n=0;
		do{
			int po1 = sc .nextInt()-1;
			int po2 = r.nextInt(2);
			System.out.println("您选择了 "+ps[po1]);
			System.out.println("电脑选择了"+ps[po2]);
			if(ps[po1].equals(ps[po2])){
				System.out.println("平局");
			}else if(po1-po2==1){
				System.out.println("您赢了");
				m++;
			}else if(po2-po1==1){
				System.out.println("你输了");
				n++;
			}else if(po1-po2==2){
				System.out.println("您输了");
				n++;
			}else if(po2-po1==2){
				System.out.println("您赢了");
				m++;
			}
		}while((m<2)&&(n<2));
		if(m>=2){
			System.out.println("您获得了最后的胜利！");
		}else if(n>=2){
			System.out.println("电脑获得了最后的胜利！");
		}
	}
}
