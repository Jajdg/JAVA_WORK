package com.imooc.io;

public class vehicle {
	
	/**
	 * 
	 * @param �ƶ��ľ���
	 */
	public void move(int i){
		System.out.println("�ƶ���"+i+"��");
	}
	/**
	 * 
	 * @param ��һ��ֵ
	 * @param �ڶ���ֵ
	 * @return �����ٶ�
	 */
	public int speedUp(int i,int j){
		return i+j;
	}
	/**
	 * 
	 * @param ��һ��ֵ
	 * @param �ڶ���ֵ
	 * @return �����ٶ�
	 */
	public int speedDown(int i,int j){
		return i-j;
	}
}
