package grocercyStore;

public class Flowers extends Item {

	//attributes specific to flower
	private String color;
	private boolean arrangment;
	
	public Flowers(String n, int t, double p, String c, String a) {
		super(n,t,p); //calls consturcor from parent class
		color = c;
		arrangment = false;
	}
	//don't need setters bc you wouln't use it aside from the consturctor
	
	public String getColor() {//gets the color
		return color;
	}
	
	public boolean getArrangment() {//gets the arrangment 
		return arrangment;
	}
	
	public void setArrangment(boolean type) {
		arrangment=type;
	}
	
	public double calcPriceOfFlowers(int quantityOrdered) {
		
		double price = getUnitPrice() * quantityOrdered;
		if (arrangment == true ) {
			price += 5;
		}
		
		return  price;
	}

	public String toString() {
		return "We currently have " + getQuantity() + " "+ color + " " + getName() + " in stock. Each cost " +  getUnitPrice();
	}

}
