
public class SalJust {
		private int sal;
		public SalJust(int s){
			sal = s;
		}
		public void setSal(int s){
			sal = s;
		}
	public void dataDeal(){
		if(sal>=10000){
			System.out.println("�����������");
		}else if(sal>=3000){
			System.out.println("����500Ԫ�����");
		}else if(sal>=2000){
			System.out.println("����600Ԫ�����");
		}else{
			System.out.println("����800Ԫ�������");
		}
	}
	public static void main(String[] args){
		SalJust sj=new SalJust(2000);
		sj.dataDeal();
		sj.setSal(12000);
		sj.dataDeal();
	}
}
