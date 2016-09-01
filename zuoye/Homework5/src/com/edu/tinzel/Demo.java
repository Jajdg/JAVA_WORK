package com.edu.tinzel;

public class Demo {

	public static void main(String[] args) {
		//声明int类型数组IArray，并使用静态初始化指定数组元素的值
		int[] iArray=new int[]{99,98,55,66,44,33,100,77};;
		
		//声明char类型数组，并使用静态初始化指定数组元素的值
		char[] cArray = new char[]{'东','南','西','北'};
		
		//声明String类型数组，并使用静态初始化指定数组元素的值
		String[] strArray = new String[]{"比尔盖茨","乔布斯","扎克伯格","拉里佩奇"};
		
		//声明String 类型数组companies,设置数组长度为3
		String[] companies = new String[3] ;
		
		//动态初始化companies数组中的每一个元素
		companies [0] = "微软" ;
		companies [1] = "苹果" ;
		companies [2] = "谷歌" ;
		
		System.out.println(strArray[0]+"\t");
		System.out.println(strArray[1]+"\t");
		System.out.println(strArray[2]+"\t");
		System.out.println(strArray[3]+"\t");
		
		for (int i = 0; i < companies.length; i++) {
			System.out.println(strArray[i]+"\t");
		}
		
		//声明String类型的数组，并为数组中的元素进行付初始值
		String[] strArray2 = {"Java","c#","JSP"};
		for (int i = 0; i < strArray2.length; i++) {
			System.out.println(strArray2[i]+"\t");
		}
		
		//初始化二维数组strArray3
		String[][] strArray3 = {{"比尔盖茨","微软"},{"乔布斯","苹果"},{"扎克伯格","Facebook"},{"拉里佩奇","谷歌"}};
	
		for (int i = 0; i < strArray3.length; i++) {
			System.out.println("公司："+strArray3[i][1]+"\t创始人："+strArray3[i][0]);
		}
	}

}
