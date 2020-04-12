package entities;

public class Employee {

	public String Name;
	public Double Salary, Tax;

	public double SalarioLiquido() {

		return Salary - Tax;

	}

	public void AumentoDeSalario(double percent) {

		Salary += Salary * (percent / 100);

	}

}
