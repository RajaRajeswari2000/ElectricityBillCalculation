package electricBillProject;

import java.util.Scanner;

public class ElectricBillCalculator {

	public static void main(String[] args) {
		DomesticCalculation dcbill = new DomesticCalculation();
		CommercialCalculation ccbill = new CommercialCalculation();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Select The Tarrif:");
		System.out.print("Enter 1 for Domestic 2 for Commerical: ");
		String tarrif = scanner.next();

		while (true) {

			if (tarrif.equalsIgnoreCase("1")) {
				System.out.println("Enter power consumption: ");
				int unit = scanner.nextInt();

				double price = dcbill.calculate(unit);
				System.out.println(price);
				break;

			} else if (tarrif.equalsIgnoreCase("2")) {
				System.out.println("Enter power consumption: ");
				int unit = scanner.nextInt();

				double price = ccbill.calculate(unit);
				System.out.println(price);
				break;
			} else {
				System.out.print("Choose the valid option, Enter 1 for Domestic 2 for Commerical: ");
				tarrif = scanner.next();
				continue;
			}
		}
	}

}
