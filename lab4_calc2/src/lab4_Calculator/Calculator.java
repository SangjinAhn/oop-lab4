package lab4_Calculator;

public class Calculator {


	public double add(double x, double y){
		return x+y;
	} 
	
	
	public double subtract(double x, double y){
		double result;
		
		result = x-y;
		return result;
		
	}
	
	public double multiply(double x, double y){
		
		
		return x*y;
	}
	
	public double divide(double x, double y){
		double result;
		result = x/y;
		if(x==0)
			System.out.println("You can divide by zero");
		return result;
	}
	
	public double remainder(double x, double y){
		double result;
		result = x%y;
		
		return result;
	}
	

	
	
	
	public static void main(String args[])

	{
		double num1 = 3;
		double num2 = 5;

		Calculator cal = new Calculator();
		double r1 = cal.add(num1, num2);
		double r2 = cal.subtract(num1, num2);
		double r3 = cal.divide(num1, num2);
		double r4 = cal.multiply(num1, num2);
		double r5 = cal.remainder(num1, num2);

		System.out.println("Add : "+ r1);
		System.out.println("Subtract : "+r2);
		System.out.println("Divide : "+r3);
		System.out.println("Multiply : "+r4);
		System.out.println("Remainder : "+r5);

	}

}
