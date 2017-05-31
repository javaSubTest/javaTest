
public class Human implements Valuable{
	private String name;
	private int age;
	Human(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	@Override
	public String toString(){
		return String.format("Human name: %s\nregitstered age: %d", getName(),getAge());
	}

	@Override
	public double EstimateValue(int month) {
		return Double.POSITIVE_INFINITY;
	}
	@Override
	public double EstimateValue(){
		return Double.POSITIVE_INFINITY;
	}
}
