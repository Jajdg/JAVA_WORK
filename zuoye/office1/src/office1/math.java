package office1;
import java.lang.Math;

public class math {
	public static void main(String[] args) {
		int i[] = new int[100];
		int a;
		for(a=0;a<=99;a++){
	    i[a] =  (int) (Math.random()*100);
	    System.out.println(i[a]);
		}
	}
	
	
}