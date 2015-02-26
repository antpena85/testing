package com.fdmgroup.pattern.command.reciever;

import com.fdmgroup.pattern.command.clients.ComfortController;
import com.fdmgroup.pattern.command.commands.SendCommand;

public class HorsepowerCommand implements SendCommand
{

	ComfortController controller;
	
	public HorsepowerCommand(ComfortController controller)
	{
		this.controller = controller;
	}
	
	@Override
	public void execute()
	{
		controller.horsePower();
	}

	@Override
	public void undo()
	{
		// TODO Auto-generated method stub
		
	}

}
