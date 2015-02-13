package com.fdmgroup.pena.antonio.model;

public class TopModelA extends Model 
{
	public TopModelA() 
	{
		model_name = "Top Hatchback";
		extirior_color = "Red";
		interior_color = "Black";
		interior_seats_type = "leather with lether inserts";
		drivetrain = "Gran Touring Engine with manual 6 speed transmission";

		options.add("Automatic windows");
		options.add("Automatic adjusting seats with lumber support");
		options.add("Heated seats");
		options.add("Panaromic Sunroof");
		options.add("Autosensing wipers");
		options.add("Bluetooth and Auxilary input");
		options.add("AutoStart");
	}
}
