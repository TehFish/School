package OOP;

public class PapersEx4CarClass {
	
	private int price;
	private double fuelConsumption;
	private int model;
	
	public PapersEx4CarClass(int price, double fuelConsumption, int model) {
		super();
		this.price = price;
		this.fuelConsumption = fuelConsumption;
		this.model = model;
	}
	
	public PapersEx4CarClass() {
		this.price = 0;
		this.fuelConsumption = 0;
		this.model = 0;
	}
	
	public boolean priceCheck() {
		return this.price > 100000;
	}
	
	public double calculateFuel(double distance) {
		return distance / this.fuelConsumption;
	}

	public String toString() {
		return "PapersEx4CarClass [price=" + price + ", fuelConsumption=" + fuelConsumption + ", model=" + model + "]";
	}
	
	public int getPrice() {
		return this.price;
	}
	
	

}
