package FlowerSystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**********************");
		System.out.println("           ÌìÖÇÁ¢ÏÊ»¨ÀñÆ·Íø");
		System.out.println("**********************");
		System.out.println("\n1¡¢ÏÊ»¨¶©¹º\n2¡¢ÀñÆ·Ñ¡¹º\n3¡¢¿ªÊ¼½áÕË\n0¡¢ÍË³öÏµÍ³");
		System.out.println("ÇëÊäÈë²Ëµ¥±àºÅ£º");

		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		do {
			try {
				int input = sc.nextInt();
				if (input > 3 || input < 0) {
					throw new Exception("ÇëÊäÈëÕıÈ·µÄ²Ëµ¥±àºÅ\n1¡¢ÏÊ»¨¶©¹º\n2¡¢ÀñÆ·Ñ¡¹º\n3¡¢¿ªÊ¼½áÕË\n0¡¢ÍË³öÏµÍ³");
				}
				// Ö´ĞĞ
				test ts = new test();
				ts.zhixing(input);
				flag = true;
			} catch (InputMismatchException el) {
				System.out.println("ÄãÊäÈëµÄ²»ÊÇÕûÊı£¬ÇëÖØĞÂÊäÈë£º");
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
				System.out.println("1¡¢Ãµ¹å»¨(£¤300)\n2¡¢¿µÄËÜ°(£¤180)\n3¡¢°×°ÙºÎ(£¤200)\nÇëÊäÈëÑ¡¹º±àºÅ£º");
				int input1 = sc.nextInt();
				System.out.println("ÇëÊäÈë¹ºÂòÊıÁ¿:");
				int count = sc.nextInt();
				switch (input1) {
				case 1:
					System.out.println("¹ºÂòÃµ¹å»¨" + count + "Ö§");
					sum += (300 * count);
					break;
				case 2:
					System.out.println("¹ºÂò¿µÄËÜ°" + count + "Ö§");
					sum += (180 * count);
					break;
				case 3:
					System.out.println("¹ºÂò°×°ÙºÎ" + count + "Ö§");
					sum += (200 * count);
					break;
				default:
					break;
				}
				System.out.println();
			} else if (input == 2) {
				System.out.println("1¡¢ÒôÀÖºĞ(£¤258)\n2¡¢HelloKitty(£¤450)\n3¡¢¿ªÒµ»¨Àº(£¤456)\nÇëÊäÈëÑ¡¹º±àºÅ£º");
				int input1 = sc.nextInt();
				System.out.println("ÇëÊäÈë¹ºÂòÊıÁ¿:");
				int count = sc.nextInt();
				switch (input1) {
				case 1:
					System.out.println("¹ºÂòÒôÀÖºĞ" + count + "¸ö");
					sum += (258 * count);
					break;
				case 2:
					System.out.println("¹ºÂòHelloKitty" + count + "Ö»");
					sum += (450 * count);
					break;
				case 3:
					System.out.println("¹ºÂò¿ªÒµ»¨Àº" + count + "Ö§");
					sum += (456 * count);
					break;
				default:
					break;
				}
				System.out.println();
			} else if (input == 3) {
				System.out.println("ÄúµÄÏû·Ñ×Ü½ğ¶îÎª" + sum + "Ôª");
			}
			System.out.println("\n1¡¢ÏÊ»¨¶©¹º\n2¡¢ÀñÆ·Ñ¡¹º\n3¡¢¿ªÊ¼½áÕË\n0¡¢ÍË³öÏµÍ³");
			System.out.println("ÇëÊäÈë²Ëµ¥±àºÅ£º");
			input = sc.nextInt();
		}
		System.exit(0);
	}
}
