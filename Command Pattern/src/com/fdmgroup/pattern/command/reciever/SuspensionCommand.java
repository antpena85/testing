package com.fdmgroup.pattern.command.reciever;

import com.fdmgroup.pattern.command.clients.ComfortController;
import com.fdmgroup.pattern.command.commands.SendCommand;

public class SuspensionCommand implements SendCommand

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
