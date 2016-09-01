package com.imooc.io;

import java.util.Scanner;

public class EncodeDemo {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		String s="Ľ��ABC";
		byte[] bytes1=s.getBytes();
		for (byte b: bytes1) {
			//���ֽڣ�ת������int����16���Ƶķ�ʽ��ʾ
			System.out.print(Integer.toHexString(b & 0xff)+"  ");
		}
		System.out.println();
		byte[] bytes2 = s.getBytes("gbk");
		for (byte b : bytes2) {
			//gbk��������ռ��2���ֽڣ�Ӣ��ռ��1���ֽ�
			System.out.print(Integer.toHexString(b & 0xff)+"��");
		}
		System.out.println();
		byte[] bytes3 =s.getBytes("utf-8");
		for (byte b : bytes3) {
			//utf-8��������ռ��3���ֽڣ�Ӣ��ռ��1���ֽ�
			System.out.print(Integer.toHexString(b & 0xff)+"  ");
		}
		System.out.println();
		//java��˫�ֽڱ��� utf-16be
		byte[] bytes4 = s.getBytes("utf-16be");
		//utf-16be ����ռ��2���ֽڣ�Ӣ��ռ��2���ֽ�
		for (byte b : bytes4) {		
			System.out.print(Integer.toHexString(b & 0xff)+"  ");
		}
		System.out.println();
		/*
		 * ������ֽ�������ĳ�ֱ���ʱ�����ʱ������ֽ����б��
		 * �ַ�����Ҳ��Ҫ�����ֱ��뷽ʽ��������������
		 */
		String str1 = new String(bytes4);
		//����ĿĬ�ϵı���
		System.out.println(str1);
		//ת��
		String str2 = new String(bytes4,"utf-16be");
		System.out.println(str2);
		/*
		 * �ı��ĵ� �����ֽ�����
		 * ���������������ֽ�����
		 * ������������Ļ�����ֱ�Ӵ����ı��ĵ�����ô���ı��ļ�ֻ��ʶANSI����
		 * ��ͨ������һ���ɺϣ��պ÷���utf-8�Ĺ���
		 */
	}
}
