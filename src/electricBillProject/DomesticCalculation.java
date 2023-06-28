package electricBillProject;

public class DomesticCalculation {

	public double calculate(int unit) {
		if(unit<=500) {
			return calculateLessThan500Units(unit);
		}else {
			return calculateMoreThan500Units(unit);
		}
	
	}
	
	public double calculateLessThan500Units(int unit) {
		double price = 0.0;

		if (unit <= 100) {
			price = 0;
		} else if (unit <= 200) {
			price = ((unit - 100) * 2.25);
		} else if (unit <= 400) {
			price = (100 * 2.25) + ((unit - 200) * 4.5);
		} else if (unit <= 500) {// 401-500
			price = (100 * 2.25) + (200 * 4.5) + ((unit - 400) * 6);
		}

		return price;

	}

	public double calculateMoreThan500Units( int unit) {
		// TODO Auto-generated method stub
		double price = 0;
		if (unit <= 100) {
			price = 0;
		} else if (unit <= 400) {
			price = ((unit - 100) * 4.5);
		} else if (unit <= 500) {
			price = (300 * 4.5) + ((unit - 400) * 6);
		} else if (unit <= 600) {// 401-500
			price = (300 * 4.5) + (100 * 6) + ((unit - 500) * 8);
		} else if (unit <= 800) {
			price = (300 * 4.5) + (100 * 6) + (100 * 8) + ((unit - 600) * 9);
		} else if (unit <= 1000) {
			price = (300 * 4.5) + (100 * 6) + (100 * 8) + (200 * 9) + ((unit - 800) * 10);
		}else {
			price =(300 * 4.5) + (100 * 6) + (100 * 8) + (200 * 9) +(200*10)+ ((unit - 1000) * 11);
		}
		return price;
	}

}
