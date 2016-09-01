
public class Shuixianhuashu {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum;
		for(int i=1;i<=9;i++)
			for(int m=0;m<=9;m++)
				for(int n=0;n<=9;n++){
					sum=i*i*i+m*m*m+n*n*n;
					if(sum==i*100+m*10+n){
						System.out.println(sum);
					}
				}
	}

}
