package com.fdmgroup.pattern.command.concreatecommand;

import com.fdmgroup.pattern.command.commands.Command;
import com.fdmgroup.pattern.command.reciever.ComfortController;

public class HorsepowerCommand implements Command
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
