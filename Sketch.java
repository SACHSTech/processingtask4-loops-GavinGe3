import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
    
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  for (int lineX = width / 20; lineX < width / 2; lineX += width / 20) {
      line(lineX, 0, lineX, width / 2);
    }
    for (int lineY = width / 20; lineY < width / 2; lineY += width / 20) {
      line(0, lineY, width/2, lineY);
    }

    for (int circleX = width/2 + width/16; circleX < width - width/16; circleX += width/11){
      for (int circleY = width/16; circleY < width/2 - width/16; circleY += width/11){
        ellipse(circleX, circleY, height/16, height/16);
      }
    }
    
    for (int gradientY = height/2; gradientY < height; gradientY ++){
      for (int gradientX = 0; gradientX < width/2; gradientX++){
        stroke(gradientX, gradientX, gradientX);
        point(gradientX, gradientY);
      }
    }

    int flowerCircleX = width / 2 + width / 4;
    int flowerCircleY = height / 2 + height / 4;
    translate(flowerCircleX, flowerCircleY);
    for (int count = 0; count < 9; count++ ) {
      ellipse(0, width / 12, width/20, height/ 6);
      rotate(radians(45));
    }
    ellipse(0, 0, width/8, width/8);
    
    

 
	
  }
  
  // define other methods down here.
}