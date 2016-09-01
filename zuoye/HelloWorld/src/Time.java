
public class Time {
	private int hours;
	private int minutes;
	private int seconds;
	private void setTime(int h,int m,int s){
		hours = h;
		minutes = m;
		seconds = s;
	}
	private void setTime(int h,int m){
		setTime(h,m,0);
	}
	private void setTime(int h){
		setTime(h,0,0);
	}
	private void display(){
		System.out.println(hours+":"+minutes+":"+seconds);
	}
	public static void main(String args[]){
		Time t = new Time();
		t.setTime(3,10,15);
		t.display();
		t.setTime(3, 10);
		t.display();
		t.setTime(3);
		t.display();
	}
}
