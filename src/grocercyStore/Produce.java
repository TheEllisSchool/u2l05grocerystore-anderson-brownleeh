package grocercyStore;

public class Produce extends Item{
		
	public Produce(String n, int t, double p) {
		super(n,t,p);
	}
		
		public double calcPriceOfProduce() {
			double price = getQuantity() * getUnitPrice();
			return  price;
		}
		
		public String toString() {
			return "We currently have " + getQuantity() + " lb of " + getName() + " in stock. Each lb cost " +  getUnitPrice();
		}

	}

