package application;

import java.util.Scanner;
import entities.Employee;

public class ReajusteSalarial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Employee e = new Employee();

		System.out.println("Qual o nome do Empregado?");
		e.Name = sc.nextLine();

		System.out.println("Digite o Salário Bruto");
		e.Salary = sc.nextDouble();

		System.out.println("Digite o Valor em impostos");
		e.Tax = sc.nextDouble();

		System.out.println("o Salário Líquido de " + e.Name + " é: " + e.SalarioLiquido());

		System.out.println("Digite um percentual de reajuste de salário");
		e.AumentoDeSalario(sc.nextDouble());
		System.out.println("O Salário Bruto após Reajuste é");
		System.out.println(e.Salary);

		sc.close();

	}

}
