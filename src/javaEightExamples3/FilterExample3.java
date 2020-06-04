package javaEightExamples3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FilterExample3 {

	public static void main(String[] args) {
		
		//using optional so that it does not show the error 
		//prints what is missing
		//specification
		
		List<Employee> employeeList = createEmployeeList();
		Optional<Employee> employeeOpt = findEmployee(employeeList, "Ria");
		
		if(employeeOpt.isPresent()) {
			Employee employee = employeeOpt.get();
			System.out.println("Employee name:" + employee.getName());
		}
		else
		{
			System.out.println("There is no employee named Ria");
		}

	}
	
	public static Optional<Employee> findEmployee(List<Employee> employeeList,String name){
		for(Employee e:employeeList) {
			if(e.getName().equalsIgnoreCase(name)) {
				return Optional.of(e);
			}
			
		}
		return Optional.empty();
	}
	
	public static List<Employee> createEmployeeList(){
		List<Employee> employeeList = new ArrayList<>();
		
		Employee e1 = new Employee("Derek", 23);
		Employee e2 = new Employee("Joy", 21);
		Employee e3 = new Employee("Drake", 19);
		Employee e4 = new Employee("Daymond", 28);
		Employee e5 = new Employee("Robert", 25);
		
		employeeList.add(e1); 
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		employeeList.add(e5);
		
		return employeeList;
		
	}

}
