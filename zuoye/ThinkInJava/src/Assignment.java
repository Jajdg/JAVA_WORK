class Tank{
		float level;
	};
public class Assignment {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tank t1= new Tank();
		Tank t2= new Tank();
		t1.level=3;
		t2.level=10;
		System.out.println("1.t1="+t1.level+" t2="+t2.level);
		t1=t2;
		System.out.println("2.t1="+t1.level+" t2="+t2.level);
		t1.level=15;
		System.out.println("3.t1="+t1.level+" t2="+t2.level);
	}

}
