package com.edu.tinzel;

public class Demo {

	public static void main(String[] args) {
		//����int��������IArray����ʹ�þ�̬��ʼ��ָ������Ԫ�ص�ֵ
		int[] iArray=new int[]{99,98,55,66,44,33,100,77};;
		
		//����char�������飬��ʹ�þ�̬��ʼ��ָ������Ԫ�ص�ֵ
		char[] cArray = new char[]{'��','��','��','��'};
		
		//����String�������飬��ʹ�þ�̬��ʼ��ָ������Ԫ�ص�ֵ
		String[] strArray = new String[]{"�ȶ��Ǵ�","�ǲ�˹","���˲���","��������"};
		
		//����String ��������companies,�������鳤��Ϊ3
		String[] companies = new String[3] ;
		
		//��̬��ʼ��companies�����е�ÿһ��Ԫ��
		companies [0] = "΢��" ;
		companies [1] = "ƻ��" ;
		companies [2] = "�ȸ�" ;
		
		System.out.println(strArray[0]+"\t");
		System.out.println(strArray[1]+"\t");
		System.out.println(strArray[2]+"\t");
		System.out.println(strArray[3]+"\t");
		
		for (int i = 0; i < companies.length; i++) {
			System.out.println(strArray[i]+"\t");
		}
		
		//����String���͵����飬��Ϊ�����е�Ԫ�ؽ��и���ʼֵ
		String[] strArray2 = {"Java","c#","JSP"};
		for (int i = 0; i < strArray2.length; i++) {
			System.out.println(strArray2[i]+"\t");
		}
		
		//��ʼ����ά����strArray3
		String[][] strArray3 = {{"�ȶ��Ǵ�","΢��"},{"�ǲ�˹","ƻ��"},{"���˲���","Facebook"},{"��������","�ȸ�"}};
	
		for (int i = 0; i < strArray3.length; i++) {
			System.out.println("��˾��"+strArray3[i][1]+"\t��ʼ�ˣ�"+strArray3[i][0]);
		}
	}

}
