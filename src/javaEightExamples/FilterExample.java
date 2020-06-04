package javaEightExamples;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterExample {

	public static void main(String[] args) {
		
		//adding products
		var p1 = new Product("Mac",50);
		var p2 = new Product("Morphe", 40);
		var p3 = new Product("Fenty", 90);
		var p4 = new Product("Sephora", 30);
		var p5 = new Product("Huda", 60);
		
		//listing the added products
		var products = List.of(p1,p2,p3,p4,p5);
		
		//using predicate to consider condition
		
		Predicate<Product> byPrice = product -> product.getPrice()> 50;
		
		
		//filtering the price and collecting the data
		var result = products.stream().filter(byPrice)
										.collect(Collectors.toList());
		
		
		//printing the result
		System.out.println(result);
		
		
	}

}
