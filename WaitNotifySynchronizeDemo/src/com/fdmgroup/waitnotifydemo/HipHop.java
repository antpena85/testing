package com.fdmgroup.waitnotifydemo;

public class HipHop implements Runnable
{
	
	Song song;
	
	public HipHop(Song song)
	{
		this.song = song;
	}

	@Override
	public void run() {
		playHipHopSongs();
		
	}
	
	private void playHipHopSongs() 
	{
		synchronized (song) 
		{
			for (int i=0; i<3; i++)
			{
				
			}
		}
	}
	

}
