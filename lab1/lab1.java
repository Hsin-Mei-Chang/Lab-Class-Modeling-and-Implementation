
class Book{
	String bname, isbn;
	int price;
	Book(String b1, String b2, int b3) {
		bname = b1;
		isbn = b2;
		price = b3;
	}
	
	String get_bname() {
		return bname;
	}
	
	String get_isbn() {
		return isbn;	
	}
	
	int get_price() {
		return price;
	}
	
	int get_shipping() {
		if(price > 100)
			return 50;
		else
			return 20;
	}
}

public class lab1 {
	
 public static void main(String[] args) { 
 Book w1 = new Book("BOOK1","ISBN1",85); 
 Book w2 = new Book("BOOK2","ISBN2",135); 
 String str1 = w1.get_bname()+","+w1.get_isbn(); 
 str1 += ","+(w1.get_price()+w1.get_shipping()); 
 String str2 = w2.get_bname()+","+w2.get_isbn(); 
 str2 += ","+(w2.get_price()+w2.get_shipping()); 
 System.out.println(str1+","+str2); 
 } 
}