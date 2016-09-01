import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Qishi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1[][]=new String[6][6];
		Head h = new Head();
		h.print();
		
		System.out.println(" ");
		Scanner sc = new Scanner(System.in);
		Selecte sl = new Selecte();
		System.out.println(sl.ss1);
		System.out.println(" ");
		sl.selectMan();
		
		Map map = new Map();
		map.GameHead();
		map.mainGame();
	}
}
class Head{
	String sh1 ="※※※※※※※※※※※※※※※※※※※※※※※※※※※ ";
	String sh2 ="//                            //";
	String sh3 ="//      骑      士      飞      行      棋             //";
	public void print(){
		System.out.println(sh1);
		System.out.println(sh2);
		System.out.println(sh2);
		System.out.println(sh3);
		System.out.println(sh2);
		System.out.println(sh2);
		System.out.println(sh1);
	}
}
class Selecte{
	String ss1 ="~~~~~~~~~~~~两  人  对  战~~~~~~~~~~~~";
	String[] sm={"戴高乐","艾森豪威尔","麦克阿瑟","巴顿"};
	int play[]= new int[2];
	public int selectMan(){
		System.out.println("请选择角色：1."+sm[0]+" 2."+sm[1]
				+" 3."+sm[2]+" 4."+sm[3] );
		System.out.print("请玩家1选择角色：  ");
		Scanner sc = new Scanner(System.in);
		play[0] = sc.nextInt();
		System.out.print("请玩家2选择角色：  ");
		play[1]= sc.nextInt();
		return play[0];
		}
}
class Map{
	String map[][]=new String[10][30];
	String Stop ="▇", Luck = "¤";
	String floorpower = "★", plane = "〓";
	String common = "∷";
	Selecte sl1=new Selecte();
	public void GameHead(){
		System.out.println("***********************************");
		System.out.println("             Game Start            ");
		System.out.println("***********************************");
		System.out.println(" ");
		System.out.println("( ^_^ )"+sl1.sm[1]+"的士兵: "+"A");
		System.out.println("( ^_^ )"+sl1.sm[2]+"的士兵: "+"B");
		System.out.println("图例："+Stop+" 暂停       "+Luck+" 幸运转盘       "
		+floorpower+" 地雷       "+plane+" 时空隧道       "+common+" 普通       ");		
	}
	public void mainGame(){
		for(int i=0;i<10;i++)
			for(int j=0;j<30;j++)
				map[i][j]=" ";
		for(int i=0;i<30;i++){
			map[0][i]="∷";
			map[5][i]="∷";
			map[9][i]="∷";
		}
		for(int i=1;i<5;i++)
			map[i][29]="∷";
		for(int i=6;i<10;i++)
			map[i][0]="∷";
		map[0][0]="@";
		map[0][5]=floorpower;
		map[0][6]=Luck;
		map[0][9]=Stop;
		map[0][15]=plane;
		map[0][20]=plane;
		for(int i=0;i<10;i++)
			for(int j=0;j<30;j++){
				System.out.print(map[i][j]);
				if(j==29)
					System.out.println("");;
				}
	}
}