package TEXT;

public class ShuGuoCharacter extends Character {
		private int emotion;
		
		public ShuGuoCharacter(String name,int maxhp,String skillname,int emotion){
			super(name,maxhp,skillname);
			this.emotion=emotion;
		}
		public void fight(){
			System.out.println(getName()+"擅长于山地地形进行搏杀");
		}
		public int getEmotion() {
			// TODO Auto-generated method stub
			return emotion;
		}
}

