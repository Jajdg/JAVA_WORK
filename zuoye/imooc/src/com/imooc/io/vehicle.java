package com.imooc.io;

public class vehicle {
	
	/**
	 * 
	 * @param 移动的距离
	 */
	public void move(int i){
		System.out.println("移动了"+i+"米");
	}
	/**
	 * 
	 * @param 第一个值
	 * @param 第二个值
	 * @return 增加速度
	 */
	public int speedUp(int i,int j){
		return i+j;
	}
	/**
	 * 
	 * @param 第一个值
	 * @param 第二个值
	 * @return 降低速度
	 */
	public int speedDown(int i,int j){
		return i-j;
	}
}
