import java.util.Scanner;

public class shili1 {

	public static void main(String[] args) {
		//输出不换行，使用空格分隔字符
		System.out.println("实现控制台输入");
		System.out.println("——————————————————————");//通过换行符“\n”换行
		System.out.print("请输入文字：");
		//通过scanner实现控制台输入
		Scanner sc = new Scanner(System.in);
		String strText = sc.next();
		System.out.println("你输入文字为："+strText);
	}

}
