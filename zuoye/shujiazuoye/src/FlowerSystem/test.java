package FlowerSystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**********************");
		System.out.println("           �������ʻ���Ʒ��");
		System.out.println("**********************");
		System.out.println("\n1���ʻ�����\n2����Ʒѡ��\n3����ʼ����\n0���˳�ϵͳ");
		System.out.println("������˵���ţ�");

		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		do {
			try {
				int input = sc.nextInt();
				if (input > 3 || input < 0) {
					throw new Exception("��������ȷ�Ĳ˵����\n1���ʻ�����\n2����Ʒѡ��\n3����ʼ����\n0���˳�ϵͳ");
				}
				// ִ��
				test ts = new test();
				ts.zhixing(input);
				flag = true;
			} catch (InputMismatchException el) {
				System.out.println("������Ĳ������������������룺");
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
				System.out.println("1��õ�廨(��300)\n2������ܰ(��180)\n3���װٺ�(��200)\n������ѡ����ţ�");
				int input1 = sc.nextInt();
				System.out.println("�����빺������:");
				int count = sc.nextInt();
				switch (input1) {
				case 1:
					System.out.println("����õ�廨" + count + "֧");
					sum += (300 * count);
					break;
				case 2:
					System.out.println("������ܰ" + count + "֧");
					sum += (180 * count);
					break;
				case 3:
					System.out.println("����װٺ�" + count + "֧");
					sum += (200 * count);
					break;
				default:
					break;
				}
				System.out.println();
			} else if (input == 2) {
				System.out.println("1�����ֺ�(��258)\n2��HelloKitty(��450)\n3����ҵ����(��456)\n������ѡ����ţ�");
				int input1 = sc.nextInt();
				System.out.println("�����빺������:");
				int count = sc.nextInt();
				switch (input1) {
				case 1:
					System.out.println("�������ֺ�" + count + "��");
					sum += (258 * count);
					break;
				case 2:
					System.out.println("����HelloKitty" + count + "ֻ");
					sum += (450 * count);
					break;
				case 3:
					System.out.println("����ҵ����" + count + "֧");
					sum += (456 * count);
					break;
				default:
					break;
				}
				System.out.println();
			} else if (input == 3) {
				System.out.println("���������ܽ��Ϊ" + sum + "Ԫ");
			}
			System.out.println("\n1���ʻ�����\n2����Ʒѡ��\n3����ʼ����\n0���˳�ϵͳ");
			System.out.println("������˵���ţ�");
			input = sc.nextInt();
		}
		System.exit(0);
	}
}
