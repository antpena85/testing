package com.fdmgroup.waitnotifydemo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Song {
	private int songNum;
	static Logger log = Logger.getLogger(Song.class);

	Song() {

		PropertyConfigurator.configure("log4j.properties");
	}

	public void loadSong() 
	{
		log.trace("Loading Song "+songNum);
	}
	
	public void playSong()
	{
		log.trace("Song "+songNum+" is no playing...");
	}
	
	public void songEnd()
	{
		log.trace(".....Song "+songNum+" has finished playing");
	}

	public int getSongNum() {
		return songNum;
	}

	public void setSongNum(int songNum) {
		this.songNum = songNum;
	}

}
