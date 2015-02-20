package com.fdmgroup.pena.antono.calculator;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.fdmgroup.pena.antonio.calculator.Calculator;

public class CalculatorTest 
{
	
	private Calculator calc;
	
	@Before
	public void setUp() 
	{
		calc = new Calculator();
	}
	
	@Test
	public void testCalcReturnsNumberWithNoOperator()
	{
		double answer = calc.calculate("2345");
		assertTrue(answer == 2345.0);
	}

	@Test
	public void testCalcReturnsSingleNumber() 
	{
		double answer = calc.calculate("4");
		assertTrue(answer == 4.0);
	}
	
	@Test
	public void testCalcReturnsDifferentSingleNumber() 
	{
		double answer = calc.calculate("5");
		assertTrue(answer == 5.0);
	}
	
	@Test
	public void testCalcReturnNaN_whenGivenLetter() 
	{
		double answer = calc.calculate("A");
		if (Double.isNaN(answer))
			assertTrue(true);
		else
			assertTrue(false);
	}
	@Test
	public void testCalcSumsTwoSingleDigitNumbers()
	{
		double answer = calc.calculate("7+2");
		assertTrue(answer ==9.0);
	}
	@Test
	public void testCalcSubtractsTwoSingleDigitNumbers()
	{
		double answer = calc.calculate("7-5");
		assertTrue(answer == 2.0);
	}
	@Test
	public void testCalcMultipliesTwoSingleDigitNumbers()
	{
		double answer = calc.calculate("7*2");
		assertTrue(answer == 14);
	}@Test
	public void testCalcDevidesTwoSingleDigitNumbers()
	{
		double answer = calc.calculate("7/2");
		assertTrue(answer == 3.5);
		
	}

}
