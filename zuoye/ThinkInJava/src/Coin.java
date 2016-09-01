import java.util.Random;

public class Coin {

    public static void main(String[] args) {
    String a[]={
    		new String("正面"),
    		new String("反面")};
    
    int i;
    i=(int) (Math.random()*2);
    System.out.println(a[i]);
    
    }
}