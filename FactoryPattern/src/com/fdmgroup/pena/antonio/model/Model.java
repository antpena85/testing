package com.fdmgroup.pena.antonio.model;

import java.util.ArrayList;

public abstract class Model {
	String model_name;
	String extirior_color;
	String interior_color;
	String interior_seats_type;
	String drivetrain;
	ArrayList<String> options = new ArrayList<String>();
	
	
	
	public void build()
	{	
		System.out.println("Building "+ model_name);
		System.out.println("Painting extirior "+ extirior_color);
		System.out.printf("Assembling interior color %s %s seats \n",interior_color,interior_seats_type);
		System.out.println("Insatlling "+drivetrain);
		System.out.println("Adding options: ");
		for(String option : options)
		{
			System.out.println(" - "+option);			
		}
	}
	public String getModel_name() {
		return model_name;
	}
}
