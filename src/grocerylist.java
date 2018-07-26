import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class grocerylist {
	//display inventory();
	//ask questions?  "prompt" and "scanner"
	//questions: "Enter item name", " add another item?"
	
	public static void main(String[] args) {
	
		//key is item as a string 
		//value is price as a double
	HashMap<String, Double> inventory = new HashMap<>();
	fillInventory(inventory);
	ArrayList<String> shoppingCart = new ArrayList<String>();
	Scanner scan =new Scanner(System.in);
	String cont;
	
	inventory.put("apple", 0.99);
	inventory.put("banana", 0.99);
	inventory.put("orange", 0.99);
	inventory.put("pineapple", 3.99);
	inventory.put("strawberries", 0.89);
	inventory.put("cherries", 1.10);
	inventory.put("starfruit", 1.00);
	inventory.put("figs", 2.09);
	
	//fills the inventory

	inventory = fillInventory(inventory);
	
	
	//displays the inventory
displayInventory(inventory);


do {
	//scanner, inventory,prompt,
	//could return a string, the add to shoppingCart
	String prompt = "What would you like to order?";
	String newItem = enterItem(scan, inventory, prompt);
	shoppingCart.add(newItem);
	System.out.println("Add another item? ");
	cont = scan.nextLine();
	cont = cont.toLowerCase();
	//"Enter Item name: "
	//"Create a shoppingCart" ArrayList
	//Add that item to shopping cart
	//"Add another item?(y/n)"
	//if yes then repeat to the top
	//if no, display : average(); and highest(); and lowest();


} while (cont.startsWith("y"));
//if no display:
System.out.println("This is your cart");
System.out.println (shoppingCart);
//average(); this displays average price of all items
average(shoppingCart, inventory);

//highest(); this displays highest price item
highest(shoppingCart, inventory);
//lowest();this display lowest price item
lowest(shoppingCart, inventory);
	}

	private static void lowest(ArrayList<String> shoppingCart, HashMap<String, Double> inventory) {
		// TODO Auto-generated method stub
		
	}

	private static void highest(ArrayList<String> shoppingCart, HashMap<String, Double> inventory) {
		double highest=0.0;
		
		for (String fruit : shoppingCart) {

		}
			
			
		
	}

	private static void average(ArrayList<String> shoppingCart, HashMap<String, Double> inventory) {
double sum = 0; // the total prices added together
int count = 0; //the number of individual items
		for (String fruit: shoppingCart) {
			
			//sum get from the inventory,
			//the "value" of the "key" in this case fruit!
			sum += inventory.get(fruit);
			count++;
		}
	}

	private static String enterItem(Scanner scan, HashMap<String, Double> inventory, String prompt) {
		String userInput;
		
		//if userInput is in our inventory, then return userInput
		//else repeat the method
		
		System.out.println(prompt);
		userInput= scan.nextLine();
		if (inventory.containsKey(userInput) == true) {
			System.out.println("Confirmation! " + userInput + "added to cart");
			
			//else, repeat the method
		}else {
			System.out.println("Sorry, we cannot help you find your" + userInput + "!:" );
			enterItem(scan, inventory, prompt);
		}
		return userInput;
	}

	private static HashMap<String,Double> fillInventory(HashMap<String, Double> inventory) {
		inventory.put("apple", 0.99);
		inventory.put("banana", 0.99);
		inventory.put("orange", 0.99);
		inventory.put("pineapple", 3.99);
		inventory.put("strawberries", 0.89);
		inventory.put("cherries", 1.10);
		inventory.put("starfruit", 1.00);
		inventory.put("figs", 2.09);
		
		return inventory;
		}

	private static void displayInventory(HashMap<String, Double>inventory) {
		//We're using a for loop
		String format = "%s\t\t%s";
		String format2 = "%-12s : %s%n";
		System.out.printf(format2,"Item ","Price");
		System.out.println();
		System.out.println("==============");
		//loop through our inventory
		for( String fruit : inventory.keySet()) {
			
			//this line print out for each individual fruit
			System.out.printf(format2, fruit, inventory.get(fruit));
			//System.out.println();
		}
		
	}

}
