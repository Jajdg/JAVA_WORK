package StuSystem;

public class luru {
	public luru(Stu[] st) {
		for (int j = 0; j < st.length; j++) {
			st[j]=new Stu();
			switch (j) {
			case 0:
				st[j].setID(1);
				st[j].setName("张三");
				st[j].setSex('男');
				st[j].setAge(20);
				st[j].setGrade(11301);
				break;
			case 1:
				st[j].setID(2);
				st[j].setName("李四");
				st[j].setSex('男');
				st[j].setAge(21);
				st[j].setGrade(11302);
				break;
			case 2:
				st[j].setID(3);
				st[j].setName("王五");
				st[j].setSex('男');
				st[j].setAge(20);
				st[j].setGrade(11301);
				break;
			case 3:
				st[j].setID(4);
				st[j].setName("麻六");
				st[j].setSex('男');
				st[j].setAge(19);
				st[j].setGrade(11301);
				break;
			case 4:
				st[j].setID(5);
				st[j].setName("赵七");
				st[j].setSex('男');
				st[j].setAge(18);
				st[j].setGrade(11301);
				break;
			default:
				break;
			}
		}

	}
}
