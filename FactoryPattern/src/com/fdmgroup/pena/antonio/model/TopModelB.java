package com.fdmgroup.pena.antonio.model;

public class TopModelB extends Model 
{
	public TopModelB() 
	{
		model_name = "Top Sedan";
		extirior_color = "Candy Red";
		interior_color = "Black";
		interior_seats_type = "leather with lether inserts";
		drivetrain = "Gran Touring Engine with manual 7 speed transmission";

		options.add("Automatic windows");
		options.add("Automatic adjusting seats with lumber support");
		options.add("Heated seats");
		options.add("Convertable hard top");
		options.add("Autosensing wipers");
		options.add("Bluetooth and Auxilary input");
		options.add("AutoStart");
	}
}
