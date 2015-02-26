package com.fdmgroup.pattern.command.clients;

import com.fdmgroup.pattern.command.clients.ComfortSelector.LEVEL;
import com.fdmgroup.pattern.command.invoker.Select;
import com.fdmgroup.pattern.command.reciever.HorsepowerCommand;
import com.fdmgroup.pattern.command.reciever.SuspensionCommand;
import com.fdmgroup.pattern.command.reciever.TransmissionCommand;


public class CommandPatternTest
{

	
	public static void main(String[] args)
	{
		ComfortController controller;
		
		
//		controller = ComfortSelector.getComfortLevel(LEVEL.CRUISE);		
//		controller = ComfortSelector.getComfortLevel(LEVEL.ECONOMIC);
		controller = ComfortSelector.getComfortLevel(LEVEL.SPORT);
		SuspensionCommand setSuspension = new SuspensionCommand(controller);
//		controller = ComfortSelector.getComfortLevel(LEVEL.ECONOMIC);
		HorsepowerCommand setHorsepower = new HorsepowerCommand(controller);
//		controller = ComfortSelector.getComfortLevel(LEVEL.CRUISE);
		TransmissionCommand setTransmission = new TransmissionCommand(controller);
		Select select = new Select();
		select.takeCommand(setSuspension);
		select.takeCommand(setHorsepower);
		select.takeCommand(setTransmission);
		
		select.placeCommand();

		
	}

}
