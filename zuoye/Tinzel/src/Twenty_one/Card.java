package Twenty_one;

public class Card {

	public static String[][] main() {
		String [][] card ={
				{"���� A","����2","����3","����4","����5","����6","����7","����8",
					"����9","����10","����J","����Q","����K"},
				{"����A","����2","����3","����4","����5","����6","����7","����8",
					"����9","����10","����J","����Q","����K"},
				{"÷��A","÷��2","÷��3","÷��4","÷��5","÷��6","÷��7","÷��8",
					"÷��9","÷��10","÷��J","÷��Q","÷��K"}	,
				{"����A","����2","����3","����4","����5","����6","����7","����8",
					"����9","����10","����J","����Q","����K"}
		};
		return card;
	}
	
	
	public static String GetCard1(int i,int j){		
		
		String[][] card = main();
		return card[i][j];
	}
	public static int Score(int j){
		if(j<10)
		return j+1;
		
		return 10;
		
	}
	public static int RandomNum(){
		
		
		return 0;
	}



}
