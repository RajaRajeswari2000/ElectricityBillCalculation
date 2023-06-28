package electricBillProject;

public class CommercialCalculation {
	
	public double calculate(int unit) {
		
		double price = 0;
		
		if (unit <= 100) {
			return price = unit * 6;
		} else {
			return price = unit * 9.5;
		}
	}

}
