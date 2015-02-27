package com.fdmgroup.pattern.command.misc;

import com.fdmgroup.pattern.command.concreatecommand.HorsepowerCommand;
import com.fdmgroup.pattern.command.concreatecommand.SuspensionCommand;
import com.fdmgroup.pattern.command.concreatecommand.TransmissionCommand;
import com.fdmgroup.pattern.command.invoker.Select;
import com.fdmgroup.pattern.command.misc.ComfortSelector.LEVEL;
import com.fdmgroup.pattern.command.reciever.ComfortController;


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
		select.setCommand(setSuspension);
		select.setCommand(setHorsepower);
		select.setCommand(setTransmission);
		
		select.getCommand();

		
	}

}
