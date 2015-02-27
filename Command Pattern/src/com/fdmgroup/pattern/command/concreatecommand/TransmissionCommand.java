package com.fdmgroup.pattern.command.concreatecommand;

import com.fdmgroup.pattern.command.commands.Command;
import com.fdmgroup.pattern.command.reciever.ComfortController;

public class TransmissionCommand implements Command
{
 public ComfortController controller;
	
	public TransmissionCommand(ComfortController controller)
	{
		this.controller = controller;
	}
	
	@Override
	public void execute()
	{
		controller.transmissionResponse();
	}

	@Override
	public void undo()
	{
		// TODO Auto-generated method stub
		
	}
}
