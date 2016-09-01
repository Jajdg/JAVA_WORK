package FlowerSystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**********************");
		System.out.println("           天智立鲜花礼品网");
		System.out.println("**********************");
		System.out.println("\n1、鲜花订购\n2、礼品选购\n3、开始结账\n0、退出系统");
		System.out.println("请输入菜单编号：");

		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		do {
			try {
				int input = sc.nextInt();
				if (input > 3 || input < 0) {
					throw new Exception("请输入正确的菜单编号\n1、鲜花订购\n2、礼品选购\n3、开始结账\n0、退出系统");
				}
				// 执行
				test ts = new test();
				ts.zhixing(input);
				flag = true;
			} catch (InputMismatchException el) {
				System.out.println("你输入的不是整数，请重新输入：");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (!flag);
	}

	public void zhixing(int input) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;

		while (input != 0) {

			if (input == 1) {
				System.out.println("1、玫瑰花(￥300)\n2、康乃馨(￥180)\n3、白百何(￥200)\n请输入选购编号：");
				int input1 = sc.nextInt();
				System.out.println("请输入购买数量:");
				int count = sc.nextInt();
				switch (input1) {
				case 1:
					System.out.println("购买玫瑰花" + count + "支");
					sum += (300 * count);
					break;
				case 2:
					System.out.println("购买康乃馨" + count + "支");
					sum += (180 * count);
					break;
				case 3:
					System.out.println("购买白百何" + count + "支");
					sum += (200 * count);
					break;
				default:
					break;
				}
				System.out.println();
			} else if (input == 2) {
				System.out.println("1、音乐盒(￥258)\n2、HelloKitty(￥450)\n3、开业花篮(￥456)\n请输入选购编号：");
				int input1 = sc.nextInt();
				System.out.println("请输入购买数量:");
				int count = sc.nextInt();
				switch (input1) {
				case 1:
					System.out.println("购买音乐盒" + count + "个");
					sum += (258 * count);
					break;
				case 2:
					System.out.println("购买HelloKitty" + count + "只");
					sum += (450 * count);
					break;
				case 3:
					System.out.println("购买开业花篮" + count + "支");
					sum += (456 * count);
					break;
				default:
					break;
				}
				System.out.println();
			} else if (input == 3) {
				System.out.println("您的消费总金额为" + sum + "元");
			}
			System.out.println("\n1、鲜花订购\n2、礼品选购\n3、开始结账\n0、退出系统");
			System.out.println("请输入菜单编号：");
			input = sc.nextInt();
		}
		System.exit(0);
	}
}
