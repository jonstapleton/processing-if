import processing.core.PApplet;

public class Main extends PApplet{

	int x = 250;
	int y = 250;

	char direction = 'l';
	
	public void settings(){
		size(500, 500);
	}
	
	public void draw(){
		background(255);
		ellipse(x, y, 100, 100);
		
		// move the ellipse left
		if(direction == 'l') {
			x = x - 2;
		}

		// switch direction if we go too far
		if(x < 0) {
			direction = 'r';
		}
	}
	
	public static void main(String[] args){
		String[] processingArgs = {"MySketch"};
		Main mySketch = new Main();
		PApplet.runSketch(processingArgs, mySketch);
	}
}