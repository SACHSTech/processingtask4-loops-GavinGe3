import processing.core.PApplet;

/**
 * A program that draws a 10x10 grid in quadrant 1, a 5x5 grid of circles in quadrant 2, a black to white gradient in quadrant 3, and a flower in quadrant 4
 * @author: Ge. G
 */

public class Sketch extends PApplet {
	
  public void settings() {
    size(800, 800);
  }

  public void setup() {
    background(255, 255, 255);
  }

  // Declare initial x value for gradient lines
  float gradientLineX = 0;

  // Declare count variable for Grid lines
  int countX = 0;
  int countY = 0;

  public void draw() {

    // Set initial stroke color and weight
    stroke(0, 0, 0);
    strokeWeight(3);

    // Quadrant 1: Draw 10x10 Grid Horizontal Lines
	  for (int lineX = width / 20; lineX < width / 2; lineX += width / 20) {
      if (countX < 9){
        line(lineX, 0, lineX, width / 2);
        countX++;
      }
    }

    // Quadrant 1: Draw 10x10 Grid Vertical Lines
    for (int lineY = height / 20; lineY < height / 2; lineY += height / 20) {
      if (countY < 9){
        line(0, lineY, width / 2, lineY);
        countY++;
      }
    }

    // Quadrant 2: Draw 5x5 circles
    fill(212, 15, 125);
    for (int circleX = width / 2 + width / 16; circleX < width - width / 16; circleX += width / 10.7){
      for (int circleY = height / 16; circleY < height / 2 - height / 16; circleY += height / 10.7){
        ellipse(circleX, circleY, height / 16, height / 16);
      }
    }
    
    // Quadrant 3: Draw Gradient 
    for (int gradientColour = 0;  gradientColour < 256;  gradientColour++){
      stroke(gradientColour, gradientColour, gradientColour);
      gradientLineX += (float)(width / 2) / 255;;
      if (gradientLineX < width / 2) {
        line(gradientLineX, height / 2, gradientLineX, height);
      }
    }
    
    // Quadrant 4: Draw Flower Pedals
    stroke(0, 0, 0);
    translate(width / 2 + width / 4 , height / 2 + height / 4);
    for (int count = 0; count < 9; count++ ) {
      fill(220, 93, 52);
      ellipse(0, height / 12, width / 20, height / 6);
      rotate(radians(45));
    }

    // Quadrant 4: Draw flower Center
    strokeWeight(0);
    fill (38, 108, 45);
    ellipse(0, 0, width / 10, width / 10);
  }
}
