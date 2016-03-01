package base;
import java.util.Scanner;
import java.text.DecimalFormat;

public class loanPayment {

	private double tuition;
	private double[] tuitionChange = new double[3];
	private double apr;
	private double repayYears;
	private double payAmount;
	private double totalCost;
	Scanner input = new Scanner(System.in);
	DecimalFormat formatter = new DecimalFormat("#.00");
	
	
	loanPayment(){
		System.out.print("Enter a starting tuition amount per year");
		tuition = input.nextDouble();
		System.out.print("Enter year 2 increase as a decimal");
		tuitionChange[0] = input.nextDouble();
		System.out.print("Enter year 3 increase as a decimal");
		tuitionChange[1] = input.nextDouble();
		System.out.print("Enter year 4 increase as a decimal");
		tuitionChange[2] = input.nextDouble();
		System.out.print("Enter APR as a decimal");
		apr = input.nextDouble();
		System.out.print("Enter number of years for repayment");
		repayYears = input.nextDouble();
	}
	loanPayment(double setTuition, double[] setTuitionChange, double setApr, double setRepayYears){
		tuition = setTuition;
		tuitionChange = setTuitionChange;
		apr = setApr;
		repayYears = setRepayYears;
	}
	
	public double calcCost()
	{
		double newTuition = tuition;
		double cost = tuition;
		
		for(double per : tuitionChange ){
			newTuition = newTuition*(1+per);
			cost = cost + newTuition;
		}
		totalCost = new Double(formatter.format(cost)).doubleValue();
		System.out.println("Total cost of college tuition: " + totalCost);
		return totalCost;
	}
	public double calcPayment(){

		payAmount = ((apr/12)*totalCost)/(1-Math.pow((1+(apr/12)),(-repayYears*12)));
		payAmount = new Double(formatter.format(payAmount)).doubleValue();
		System.out.println("Payment amount: " + payAmount );
		return payAmount;
	}
}
