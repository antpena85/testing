package com.fdmgroup.pattern.command.invoker;

import java.util.ArrayList;
import java.util.List;

import com.fdmgroup.pattern.command.commands.SendCommand;

public class Select
{
	private List<SendCommand> sendList = new ArrayList<SendCommand>();
	
	public void takeCommand(SendCommand command)
	{
		sendList.add(command);
	}
	public void placeCommand()
	{
		for(SendCommand command: sendList)
			command.execute();
		sendList.clear();
	}
	
}
