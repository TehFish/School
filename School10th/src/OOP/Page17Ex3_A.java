package OOP;

public class Page17Ex3_A {
	private int bankNum;
	private int branchNum;
	private int accountNum;
	private int id;
	private int balance;
	private int maxDraw;
	
	public Page17Ex3_A(int bankNum, int branchNum, int accountNum, int id, int balance, int maxDraw) {
		this.bankNum = bankNum;
		this.branchNum = branchNum;
		this.accountNum = accountNum;
		this.id = id;
		this.balance = balance;
		this.maxDraw = maxDraw;
	}
	
	public void insertFunds(int insert) {
		this.balance += insert;
	}
	
	public boolean drawFunds(int draw) {
		if (draw <= this.maxDraw) {
			balance -= draw;
			return true;
		}
		return false;
	}

	public int getMaxDraw() {
		return maxDraw;
	}
}
