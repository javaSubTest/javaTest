
public class Car implements Valuable{
	private String name;
	private double price;
	
	public Car(String name, double price){
		this.name = name;
		this.price = price;
	}
	
	public String getName(){
		return name;
	}
	
	public double getPrice(){
		return price;
	}
	
	@Override
	public String toString(){
		return String.format("car name: %s\ninitial price: %.2f", getName(),getPrice());
	}

	@Override
	public double EstimateValue(int month) {
		return price*0.8 *Math.pow(0.99,month);
	}
	@Override
	public double EstimateValue() {
		return price*0.8 *Math.pow(0.99,1);
	}
}
