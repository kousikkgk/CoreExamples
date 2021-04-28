package com.coreexamples.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.coreexamples.model.Employee;

public class Java8Interview {

	public static void main(String[] args) {
		 List<Employee> employeeList = createEmployeeList();
		 
		 /**1.you need to filter all the employee whose age is greater than 20 and print the employee names.**/
		 employeeList.stream()
		 			.filter(a->a.getAge()>20)
		 			.map(Employee::getName)
		 			.collect(Collectors.toList())
		 			.forEach(System.out::print);
	
		 /**2.count number of employees with age 25?**/
		 System.out.println(employeeList.stream()
				 						.filter(e->e.getAge()>25)
				 						.count());
		 
		 /**3. find the employee with name “Mary”.**/
		 employeeList.stream()
		 			.filter(e->e.getName().equalsIgnoreCase("Mary"))
		 			.findAny()
		 			.ifPresent(System.out::println);
	
		 /**4.find maximum age of employee**/
		 employeeList.stream().mapToInt(e->e.getAge()).max().ifPresent(System.out::println);
		 
		 /**5.sort all the employee on the basis of age?**/
		 employeeList.sort((e1,e2)->e1.getAge()-e2.getAge());
		 employeeList.forEach(System.out::println);
	}

	public static List<Employee> createEmployeeList() {
		List<Employee> employeeList = new ArrayList<>();

		Employee e1 = new Employee("John", 21);
		Employee e2 = new Employee("Martin", 19);
		Employee e3 = new Employee("Mary", 31);
		Employee e4 = new Employee("Stephan", 18);
		Employee e5 = new Employee("Gary", 26);

		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		employeeList.add(e5);

		return employeeList;
	}
}
