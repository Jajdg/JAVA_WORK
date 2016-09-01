package shudianguanli;

import java.util.Iterator;
import java.util.Scanner;

public class test {
	
	Scanner sc = new Scanner(System.in);
	zhanghao zh = new zhanghao();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test ts = new test();
		ts.head();
	}
	
	public void head(){
		System.out.println("	          书店管理销售系统 		   ");
		System.out.println("---------------------------");
		System.out.println("        1.登 录 系 统                          ");
		System.out.println("    	2.退 出			   ");
		System.out.println("---------------------------");
		
		
		System.out.println("请选择，输入数字：");
		int input = sc.nextInt();
		if(input == 1){
			System.out.println("请输入账号：");
			zh.setId(sc.next());
			System.out.println("请输入密码：");
			zh.setPassword(sc.next());
		}else{
			System.exit(0);
		}
		
		
		System.out.println("	          书店管理销售系统 		   ");
		System.out.println("---------------------------");
		System.out.println("        1.会 员 管 理                          ");
		System.out.println("    	2.书 籍 管 理		   ");
		System.out.println("    	3.购 物 结 算		   ");
		System.out.println("    	4.积 分 兑 换 礼 品	   ");
		System.out.println("    	5.注 销			   ");
		System.out.println("---------------------------");
		
		
		switch (sc.nextInt()) {
		case 1:
			//会员管理
			huiyuanguanli();
			System.out.println("书店管理销售系统>会员管理");
			break;
		case 2:
			//书籍管理
			System.out.println("书店管理销售系统>书籍管理");
			break;
		case 3:
			//购物结算
			System.out.println("书店管理销售系统>购物结算");
			break;
		case 4:
			//积分兑换礼品
			System.out.println("书店管理销售系统>积分兑换礼品");
			break;
		case 5:
			//注销
			System.out.println("书店管理销售系统>注销");
			break;
		default:
			break;
		}
	}
	
	public void huiyuanguanli(){
		do{
			System.out.println("---------------------------");
			System.out.println("        1.显 示 所 有 会 员 信 息       ");
			System.out.println("    	2.添 加 会 员 星 系	   ");
			System.out.println("	    3.修 改 会 员 信 息 	   ");
			System.out.println("	    m.返 回 主 菜 单 		   ");
			System.out.println("---------------------------");
			System.out.println("请选择，输入数字：");
			switch(sc.next().charAt(0)){
			case '1':
				System.out.println("书店管理销售系统>会员信息管理>显示会员信息");
				huiyuan();
				break;
			case '2':
				
				break;
			case '3':
				
				break;
			case 'm':
				return ;
			default:
				break;
			}
		}while(true);
	}  
	public void huiyuan(){
		int[][] huiyuan = new int [][]{
			{1100,18,100},{1101,24,834},{1102,13,20000},{1103,20,2938},
			{1104,22,500},{1105,22,3569},{1106,45,45},{1107,6,450}
		};
		System.out.println("\t会员号\t年龄\t积分");
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < huiyuan[i].length; j++) {
				System.out.println("\t"+huiyuan[i][0]+"\t"+huiyuan[i][1]+"\t"+huiyuan[i][2]);
			}
		}
	}
}
