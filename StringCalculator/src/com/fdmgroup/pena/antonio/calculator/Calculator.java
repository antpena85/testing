package com.fdmgroup.pena.antonio.calculator;


public class Calculator 
{	
	public double calculate(String expression)
	{
		double answer = 0;

		try
		{
			if(expression.length() == 1)
				return Double.parseDouble(expression);
						
			
			
			for(int i = 0, n = expression.length() ; i < n ; i++)
			{
				char c = expression.charAt(i);
				
//				double first = 
				
				double first = Double.parseDouble(expression.charAt(0)+"");
				double second = Double.parseDouble(expression.charAt(2)+"");
				
				switch (c) {
				case '+':
					answer = sum(first,second);
					break;
				case '-':
					answer = sub(first,second);
					break;
				case '*':
					answer = mul(first,second);
					break;
				case '/':
					answer = div(first,second);		
					break;
				default:
					break;
				}
			}

			
		}
		catch(NumberFormatException e)
		{
			answer = Double.NaN;
		}
		return answer;
	}
	
	
	private double sum(double first, double second) 
	{
		return first+second;
	}
	private double sub(double first, double second) 
	{
		return first-second;
	}
	private double mul(double first, double second) 
	{
		return first*second;
	}
	private double div(double first, double second) 
	{
		return first/second;
	}
}
