package com.fdmgroup.pattern.command.reciever;

import com.fdmgroup.pattern.command.clients.ComfortController;
import com.fdmgroup.pattern.command.commands.SendCommand;

public class TransmissionCommand implements SendCommand
{
ComfortController controller;
	
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
