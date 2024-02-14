package model;

/**
 * Maya Cruz - Gcruz6
 * CIS175 -Spring 2024
 * Feb 13, 2024
 */
public class ExpenseTracker {
	
	private int rent;
	private int groceries;
	private int gas;
	private int entertainment;
	private int other;
	 
	public ExpenseTracker() {
		super();
	}

	public ExpenseTracker(int rent, int groceries, int gas, int entertainment, int other) {
		super();
		this.rent = rent;
		this.groceries = groceries;
		this.gas = gas;
		this.entertainment = entertainment;
		this.other = other;
	}

	public int getRent() {
		return rent;
	}

	public void setRent(int rent) {
		this.rent = rent;
	}

	public int getGroceries() {
		return groceries;
	}

	public void setGroceries(int groceries) {
		this.groceries = groceries;
	}

	public int getGas() {
		return gas;
	}

	public void setGas(int gas) {
		this.gas = gas;
	}

	public int getEntertainment() {
		return entertainment;
	}

	public void setEntertainment(int entertainment) {
		this.entertainment = entertainment;
	}

	public int getOther() {
		return other;
	}

	public void setOther(int other) {
		this.other = other;
	}

	@Override
	public String toString() {
		return "ExpenseTracker [rent=" + rent + ", groceries=" + groceries + ", gas=" + gas + ", entertainment="
				+ entertainment + ", other=" + other + "]";
	}
	 
	
	 

}
