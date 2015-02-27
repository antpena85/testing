package com.fdmgroup.pattern.command.invoker;

import java.util.ArrayList;
import java.util.List;

import com.fdmgroup.pattern.command.commands.Command;

public class Select
{
	private List<Command> commandList = new ArrayList<Command>();
	
	public void setCommand(Command command)
	{
		commandList.add(command);
	}
	public void getCommand()
	{
		for(Command command: commandList)
			command.execute();
		commandList.clear();
	}
	
}
