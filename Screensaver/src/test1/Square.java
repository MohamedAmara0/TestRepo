package test1;

import screensaver.Screensaver;

public class Square {
	int x;	//The x-coordinate of the square
	int y;	//The y-coordinate of the square
	int height;	//Height of the square
	int width;	//Width of the square
	int phase;	//What phase of its movement the square is on
	int startPosition;	//Holds the start position of the square (top, center or bottom)
	int stage;	//What stage the whole app is on
	
	//Constructor that sets all the variables
	Square(int c, int d, int e){
		x = 0 - d;
		y = Screensaver.height/2 + height/2;
		height = c;
		width = d;
		startPosition = e;
		phase = 0;
		stage = 0;
		checkPositionY();
	}
	
	//Sets the square to either the top or bottom if it needs to be there
	public void checkPositionY(){
		if (startPosition == 1){
			y += 150;
		}
		else if (startPosition == 2){
			y -= 150;
		}
	}
	
	//Sets the star to either the left or right of the center star
		public void checkPositionX(){
			if (startPosition == 1){
				x += 200;
			}
			else if (startPosition == 2){
				x -= 200;
			}
		}
	public void starMove(){

		switch (phase){
		//Goes from bottom left to top right
			case 0:
				x +=2;
				y --;
				if (x == Screensaver.width){
					y = Screensaver.height/4 ;
					checkPositionY();
					phase ++;
				}
				break;
			//Goes from top right to bottom left
			case 1:
				x -= 2;
				y ++;
				if (y == Screensaver.height + 500){
					x = Screensaver.width/2;
					y = Screensaver.height/2;
					checkPositionX();
					width = 0;
					height = 0;
					phase++;
				}
				break;
			//Stars start in middle of screen as 1x1 and grow until they take up the whole screen
			case 2:
				width += 6;
				height += 6;
				x -= 3;
				y -= 3;
				if(width > Screensaver.width * 4){
					phase = 0;
					stage++;
				}
				break;
		}
	}
	
	//Getters and Setters
		public int getStage() {
			return stage;
		}

		public void setStage(int stage) {
			this.stage = stage;
		}

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}

		public int getHeight() {
			return height;
		}

		public void setHeight(int height) {
			this.height = height;
		}

		public int getWidth() {
			return width;
		}

		public void setWidth(int width) {
			this.width = width;
		}
		
		//Changes the value of stage
		public void stageChange(int x){
			this.stage += x;
		}
}
