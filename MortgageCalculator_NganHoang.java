/*
 * Name : Ngan Hoang
 * Date : 10/1/2019
 * Purpose : Mortgage Calculating Assignment
 * Program : Mortgage Calculation
 * Course : CSC 110AB
 */

package assignment;

public class MortgageCalculator_NganHoang {

	public static void main(String[] args) {
		int n, years, PV;
		double i,y, Pmt;
		
		years = 30;
		PV = 225000;
		y = 3.75;
		i = y/100/12;
		n = years * 12;
		
		Pmt = (i * PV)/ (1-Math.pow((1+i),(-n)));
		
		System.out.println("Present Value : "+ PV);
		System.out.println("Term (years) :  "+ years);
		System.out.println("Term (months) : "+ n );
		System.out.println("Rate :          "+ y );
		System.out.printf("Payment :       %06.2f  ", Pmt);
	}

}
