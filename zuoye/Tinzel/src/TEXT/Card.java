package TEXT;
	//卡牌类

public class Card {
	private String color;//花色 	0-黑桃，1-红桃，2-梅花，3-方块
	private String num;// 牌面值	0-12
	private String key;// 牌面功能：杀，闪，桃
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color=color;
	}
	public String getNum(){
		return num;
	}
	public void  setNum(String num){
		this.num=num;
	}
	public String getKey(){
		return key;
	}
	public void  setKey(String key){
		this.key=key;
	}
}
