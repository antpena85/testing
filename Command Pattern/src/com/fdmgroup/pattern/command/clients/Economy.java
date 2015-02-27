package com.fdmgroup.pattern.command.clients;

import com.fdmgroup.pattern.command.reciever.ComfortController;

public class Economy implements ComfortController
{

	@Override
	public void suspensionStiffness()
	{
		System.out.println("Suspension is on 35% stiffness");	
	}

	@Override
	public void horsePower()
	{
		System.out.println("Horsepower output is at 25%");
	}

	@Override
	public void transmissionResponse()
	{
		System.out.println("Transmission shifts at 2500 rpms");
	}


}
