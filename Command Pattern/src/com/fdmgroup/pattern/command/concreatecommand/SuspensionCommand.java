package com.fdmgroup.pattern.command.concreatecommand;

import com.fdmgroup.pattern.command.commands.Command;
import com.fdmgroup.pattern.command.reciever.ComfortController;

public class SuspensionCommand implements Command

{
	ComfortController controller;
	
	public SuspensionCommand(ComfortController controller)
	{
		this.controller = controller;
	}
	
	
	@Override
	public void execute()
	{
		controller.suspensionStiffness();
	}


	@Override
	public void undo()
	{
		// TODO Auto-generated method stub
		
	}

}
