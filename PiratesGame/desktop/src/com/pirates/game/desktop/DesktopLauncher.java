package com.pirates.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.pirates.game.LaunchGame;

public class DesktopLauncher {

	public void setup()
	{
		boolean isRunning = true;
		//Game a  = new Game();
		
	}
	public  void input()
	{
	
	}
	public  void draw()
	{
		
	}
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new LaunchGame(), config);
	}
}
