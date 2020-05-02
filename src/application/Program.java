package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourceEmployee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		List<Employee> employees = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			System.out.println("--Employee #" + i + " data--");
			System.out.print("Outsourced (y/n): ");
			sc.nextLine();
			String aws = sc.nextLine();
			System.out.print("Name: ");
			String nameEmployee = sc.nextLine();
			System.out.print("Hours: ");
			int hoursEmployee = sc.nextInt();
			System.out.print("Value per hour: ");
			double valueHour = sc.nextDouble();
			if (aws.charAt(0) == 'y' || aws.charAt(0) == 'Y') {
				System.out.print("Additional charge: ");
				double addCharge = sc.nextDouble();
				employees.add(new OutsourceEmployee(nameEmployee, hoursEmployee, valueHour, addCharge));
			}
			else {
				employees.add(new Employee(nameEmployee, hoursEmployee, valueHour));
			}
		}
		System.out.println("\nPAYMENTS:");
		for (Employee emp : employees) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}

		sc.close();
	}

}
