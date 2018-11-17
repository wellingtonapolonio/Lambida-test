package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class Program {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv",20, 900.00));
		list.add(new Product("Mouse",5, 50.00));
		list.add(new Product("Tablet",12, 350.50));
		list.add(new Product("HD Case", 13,80.90));
		

		list.sort((p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		list.removeIf(p -> p.getPrice() >= 100.00);
		
		for (Product p : list) {
			System.out.println("Total product: "+ p.toString());
		}
		
	
	
		
		
	
		
	}

}
