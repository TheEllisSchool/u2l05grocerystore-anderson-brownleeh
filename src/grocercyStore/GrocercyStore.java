package grocercyStore;

import javax.swing.JOptionPane;

public class GrocercyStore {

	public static void main(String[] args) {
	
		
		Item beans = new Item ("cans of beans",10,5.0);
		System.out.println(beans);
		
		Flowers roses = new Flowers ("roses",50,3.0,"red","na");
		System.out.println(roses);
		
		Produce bannanas = new Produce ("bannanas",50,6.0);
		System.out.println(bannanas);
		
		////
		
		//controls bannana ordering
		String input = JOptionPane.showInputDialog("How many lb. of bannanas do you want?"); // get number from user
		int order = Integer.parseInt(input);
		int newQuantity = bannanas.changeQuantity(bannanas.getQuantity(), order);//updates inventory
		bannanas.setQuantity(newQuantity);
		System.out.println("You have ordered " + order + " lb of " + bannanas.getName()+ " which will cost " + bannanas.calcPrice(order));
		System.out.println(bannanas);//reprints inventory
		
		//controls flower ordering
		input = JOptionPane.showInputDialog("How many roses do you want?"); //get user input
		order = Integer.parseInt(input);
		newQuantity = roses.changeQuantity(roses.getQuantity(), order); // update inventory
		roses.setQuantity(newQuantity); 
		
		String type = JOptionPane.showInputDialog("Do you want your flowers in an arrangment, true or false"); // does the arrangment add 5 dollars bit
		boolean yesno = Boolean.parseBoolean(type);
		//System.out.println("testing: "+roses.getArrangment());
		roses.setArrangment(yesno);
		//System.out.println("testing 2: "+roses.getArrangment());
		
		System.out.println("You have ordered " + order + " of " + roses.getName()+ " which will cost " + roses.calcPriceOfFlowers(order));
		System.out.println(roses);
		
		//controls bean ordering
		input = JOptionPane.showInputDialog("How many cans of beans do you want?"); //get user input
		order = Integer.parseInt(input);
		newQuantity = beans.changeQuantity(beans.getQuantity(), order); // update inventory
		beans.setQuantity(newQuantity);
		System.out.println("You have ordered " + order + " of " + beans.getName()+ " which will cost " + beans.calcPrice(order));
		System.out.println(beans);//reprints inventory
		
		
		
	}

}

