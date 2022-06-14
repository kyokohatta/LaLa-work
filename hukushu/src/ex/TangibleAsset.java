package ex;

public class TangibleAsset implements Thing {
	String name;
	int price;
	String color;
	double weight;
	
	public TangibleAsset (String name, int price, String color) {
		this.name = name;
		this.price = price;
		this.color = color;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public String getColor() {
		return this.color;
	}

	@Override
	public double getWeight() {
		// TODO 自動生成されたメソッド・スタブ
		return this.weight;
	}

	@Override
	public void setWeight(double weight) {
		this.weight = weight;
		
	}
	
	
}
