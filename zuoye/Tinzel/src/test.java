
public class test {
		public static void main(String[] args){
		//11ÐÐ£¬ÁÐ
		/*1     *        
		 *2    * *
		 *3   * * *
		 *4  * * * *
		 *5 * * * * *
		 *6* * * * * *
		 *7 * * * * *
		 *8  * * * *
		 *9   * * *
		 *10   * *
		 *11    *
		 * */
		int k;
		for(int i=1;i<=6;i++){
			for(k=1;k<=6-i;k++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=5;i>=1;i--){
			for(k=1;k<=6-i;k++){
				System.out.print(" ");
			}
			for(int j=5;j>=6-i;j--){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
