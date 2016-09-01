package Stus;

public class Stu {
	private int id;
	private String name;
	private char sex;
	private int age;
	private int grade;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public Stu(int id, String name, char sex, int age, int grade) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.grade = grade;
	}
	public Stu() {
		super();
	}	
	
}
