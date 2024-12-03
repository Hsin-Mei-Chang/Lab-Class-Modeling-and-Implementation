class Product {

	String pname;
	int price;

	Product() {
	}

	Product(String p1, int p2) {
		pname = p1;
		price = p2;
	}

	String getName() {
		return pname;
	}

	int getPrice() {
		return price;
	}

}

class Drinks extends Product {

	int amount;

	Drinks() {
	}

	Drinks(String d1, int d2, int d3) {
		pname = d1;
		price = d2;
		amount = d3;
	}

	int getAmount() {
		return amount;
	}
}

public class lab2 {
	public static void main(String[] args) {
		Product a1 = new Drinks("BEER", 90, 350);
		Drink a2 = new Drinks("SODA", 80, 200);
		String str1 = a1.getName() + "," + a1.getPrice();
		String str2 = a2.getName() + "," + a2.getAmount();
		System.out.print(str1 + ";" + str2);
	}
}