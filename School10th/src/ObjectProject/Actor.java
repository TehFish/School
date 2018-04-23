package ObjectProject;

public class Actor {
	private String name;
	private int yearsActing;
	private int age;
	private boolean awardWon;
	private boolean check;
	
	public Actor(String name, int yearsActing, int age, boolean awardWon) {
		super();
		this.name = name;
		this.yearsActing = yearsActing;
		this.age = age;
		this.awardWon = awardWon;
	}
	
	public boolean isCheck() {
		return this.check;
	}
	public void setCheck(boolean check) {
		this.check = check;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYearsActing() {
		return yearsActing;
	}
	public void setYearsActing(int yearsActing) {
		this.yearsActing = yearsActing;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isAwardWon() {
		return awardWon;
	}
	public void setAwardWon(boolean awardWon) {
		this.awardWon = awardWon;
	}
	
}
