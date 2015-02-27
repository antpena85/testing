package com.fdmgroup.pattern.command.misc;

import com.fdmgroup.pattern.command.clients.Cruiser;
import com.fdmgroup.pattern.command.clients.Economy;
import com.fdmgroup.pattern.command.clients.Sport;
import com.fdmgroup.pattern.command.reciever.ComfortController;

public class ComfortSelector
{
	protected enum LEVEL {SPORT, ECONOMIC, CRUISE};
	public static ComfortController getComfortLevel(LEVEL level)
	{
			if(level == LEVEL.SPORT)
				return new Sport();
			else if (level == LEVEL.ECONOMIC)
				return new Economy();
			else if (level == LEVEL.CRUISE)
				return new Cruiser();
			else
				return null;			
	}
}
