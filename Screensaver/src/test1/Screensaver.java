package test1;

import java.awt.Dimension;
import java.awt.Toolkit;

public class Screensaver {
	//Code taken from https://stackoverflow.com/questions/5689676/how-can-i-get-the-screen-resolution-in-java
	//Used to make the program fullScreen
	public static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	public static int width = (int) screenSize.getWidth();
	public static int height = (int) screenSize.getHeight();
	//Holds the number of objects going around the screen
	public static int numObjects = 4;
}
