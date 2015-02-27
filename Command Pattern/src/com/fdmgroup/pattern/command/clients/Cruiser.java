package com.fdmgroup.pattern.command.clients;

import com.fdmgroup.pattern.command.reciever.ComfortController;

public class Cruiser implements ComfortController
{

	@Override
	public void suspensionStiffness()
	{
		System.out.println("Suspesion is on 15% soft");
	}

	@Override
	public void horsePower()
	{
		System.out.println("Horsepower output is at 75%");
	}

	@Override
	public void transmissionResponse()
	{
		System.out.println("Transmission shifts at 3500 rpms");
	}


}
