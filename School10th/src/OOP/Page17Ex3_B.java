package OOP;

public class Page17Ex3_B {
	private int accountNum;
	private int id;
	private int openingYear;
	private int monthlyInsert;
	private int balance;
	
	public Page17Ex3_B(int accountNum, int id, int openingYear, int monthlyInsert, int balance) {
		this.accountNum = accountNum;
		this.id = id;
		this.openingYear = openingYear;
		this.monthlyInsert = monthlyInsert;
		this.balance = balance;
	}
	
	public void insertMonthly(int amount) {
		balance += monthlyInsert;
	}
	
	public int getMonthlyInsert() {
		return monthlyInsert;
	}

	public int yearsLeft(int currentYear) {
		return 15 - (currentYear - this.openingYear);
	}
}
