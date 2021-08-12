package entities;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;
	
	
	public double netSalary(){
		
		return grossSalary - tax;
		
	}
	
	public double increaseSalary(double porcento){
		
		return porcento * grossSalary;
		
	}
	
	public String toString(){
		return name
			+ ", $ "
			+ String.format("%.2f", grossSalary)
			+ ", "
			+ tax
			+ " units, Total: $ "
			+String.format("%.2f", netSalary());
	}
}
