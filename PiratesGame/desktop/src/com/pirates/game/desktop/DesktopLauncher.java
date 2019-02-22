package com.pirates.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.pirates.game.LaunchGame;

public class DesktopLauncher {
	public class Personnage
	{
		public int m_vie;
	}
	public void setup()
	{
		boolean isRunning = true;
		Personnage a  = new Personnage();
		
	}
	public static void input()
	{
	
	}
	public static void draw()
	{
		
	}
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new LaunchGame(), config);
	}
}
