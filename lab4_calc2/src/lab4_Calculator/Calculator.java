package lab4_Calculator;

public class Calculator {

	
	
	
	public double add(double x, double y){
		return 0;
	} 
	
	
	public double subtract(double x, double y){
		double result;
		
		result = x-y;
		return result;
		
	}
	
	public double multiply(double x, double y){
		
		return 0;
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
		
		
		
		
	}
	
}
