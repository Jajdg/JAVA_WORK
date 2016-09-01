package com.imooc.io;

import java.util.Scanner;

public class EncodeDemo {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		String s="慕课ABC";
		byte[] bytes1=s.getBytes();
		for (byte b: bytes1) {
			//把字节（转换成了int）以16进制的方式显示
			System.out.print(Integer.toHexString(b & 0xff)+"  ");
		}
		System.out.println();
		byte[] bytes2 = s.getBytes("gbk");
		for (byte b : bytes2) {
			//gbk编码中文占用2个字节，英文占用1个字节
			System.out.print(Integer.toHexString(b & 0xff)+"　");
		}
		System.out.println();
		byte[] bytes3 =s.getBytes("utf-8");
		for (byte b : bytes3) {
			//utf-8编码中文占用3个字节，英文占用1个字节
			System.out.print(Integer.toHexString(b & 0xff)+"  ");
		}
		System.out.println();
		//java是双字节编码 utf-16be
		byte[] bytes4 = s.getBytes("utf-16be");
		//utf-16be 中文占用2个字节，英文占用2个字节
		for (byte b : bytes4) {		
			System.out.print(Integer.toHexString(b & 0xff)+"  ");
		}
		System.out.println();
		/*
		 * 当你的字节序列是某种编码时，这个时候想把字节序列变成
		 * 字符串，也需要用这种编码方式，否则会出现乱码
		 */
		String str1 = new String(bytes4);
		//用项目默认的编码
		System.out.println(str1);
		//转换
		String str2 = new String(bytes4,"utf-16be");
		System.out.println(str2);
		/*
		 * 文本文档 就是字节序列
		 * 可以是任意编码的字节序列
		 * 如果我们在中文机器上直接创建文本文档，那么该文本文件只认识ANSI编码
		 * 联通、联是一个巧合，刚好符合utf-8的规则
		 */
	}
}
