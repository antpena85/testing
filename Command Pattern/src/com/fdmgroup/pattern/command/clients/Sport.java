package com.fdmgroup.pattern.command.clients;

import com.fdmgroup.pattern.command.reciever.ComfortController;

public class Sport implements ComfortController
{
	@Override
	public void suspensionStiffness()
	{
		System.out.println("Suspesion is set to 85% stiff");
	}

	@Override
	public void horsePower()
	{
		System.out.println("Horsepower output is at 100%");
	}

	@Override
	public void transmissionResponse()
	{
		System.out.println("Transmission shift at 7000 rpms and 45% increase in shift speed");
	}
}
