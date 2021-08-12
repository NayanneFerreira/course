package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramEmployee {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		
		System.out.println();
		
		System.out.print("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();


		System.out.println();
		
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		
		System.out.println(employee);
	}

}
