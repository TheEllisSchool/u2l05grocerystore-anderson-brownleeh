package grocercyStore;


public class Item {
	
	private String name;
	private int inStock;
	private double unitPrice;

//Consturtors
	public Item() { // default constructor
		name = "none given";
		inStock = -1;
		unitPrice = -1.0;	
	}
	public Item (String n, int t, double p) {
		name = n;
		inStock = t;
		unitPrice = p;
	}
//name	
	public void setName (String n) {//sets the name to what you put it as
		name=n;
	}
	public String getName() {//sets the name to what you put it as
		return name;
	}
//Unit price	
	public void setUnitPrice (double p) {
		unitPrice=p;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
//quantity in stock
	public void setQuantity (int p) {
		inStock=p;
	}
	public int getQuantity() {
		return inStock;
	}
//change quantity
	public int changeQuantity(int inStock, int change) {
		inStock += change*-1;
		if (inStock<0) {
			System.out.println("We don't have that many");
		}
		return inStock;
		
	}
	
	public double calcPrice(int quantityOrdered) {
		double totalPrice = unitPrice * quantityOrdered;
		return totalPrice;
	}
//to string meathod	
	public String toString() {
		return "We currently have " + inStock +" " + name + " in stock. Each cost " + unitPrice;
	}
}
