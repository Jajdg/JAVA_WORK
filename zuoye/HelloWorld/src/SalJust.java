
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
			System.out.println("不给予生活辅助");
		}else if(sal>=3000){
			System.out.println("给予500元生活补助");
		}else if(sal>=2000){
			System.out.println("给予600元生活补助");
		}else{
			System.out.println("给予800元的生活补助");
		}
	}
	public static void main(String[] args){
		SalJust sj=new SalJust(2000);
		sj.dataDeal();
		sj.setSal(12000);
		sj.dataDeal();
	}
}
