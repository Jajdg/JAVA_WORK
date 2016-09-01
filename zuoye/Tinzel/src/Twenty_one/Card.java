package Twenty_one;

public class Card {

	public static String[][] main() {
		String [][] card ={
				{"ºÚÌÒ A","ºÚÌÒ2","ºÚÌÒ3","ºÚÌÒ4","ºÚÌÒ5","ºÚÌÒ6","ºÚÌÒ7","ºÚÌÒ8",
					"ºÚÌÒ9","ºÚÌÒ10","ºÚÌÒJ","ºÚÌÒQ","ºÚÌÒK"},
				{"ºìÌÒA","ºìÌÒ2","ºìÌÒ3","ºìÌÒ4","ºìÌÒ5","ºìÌÒ6","ºìÌÒ7","ºìÌÒ8",
					"ºìÌÒ9","ºìÌÒ10","ºìÌÒJ","ºìÌÒQ","ºìÌÒK"},
				{"Ã·»¨A","Ã·»¨2","Ã·»¨3","Ã·»¨4","Ã·»¨5","Ã·»¨6","Ã·»¨7","Ã·»¨8",
					"Ã·»¨9","Ã·»¨10","Ã·»¨J","Ã·»¨Q","Ã·»¨K"}	,
				{"·½¿éA","·½¿é2","·½¿é3","·½¿é4","·½¿é5","·½¿é6","·½¿é7","·½¿é8",
					"·½¿é9","·½¿é10","·½¿éJ","·½¿éQ","·½¿éK"}
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
