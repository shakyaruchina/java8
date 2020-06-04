package javaEightExamples2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample2 {

	public static void main(String[] args) {
		
		//list of string names
		List<String> names = Arrays.asList("Stephaie", "Brittany", "Joe", "Mike");
		
		//streaming the list of names 
		//sorting
		//collection
		
		List<String> sortedList = names.stream().sorted().collect(Collectors.toList());
		
		
		//printing 
		sortedList.forEach(System.out::println);
	}

}
