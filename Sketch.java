import processing.core.PApplet;

/**
 * @Author: Ge. G
 * A program that draws a 10x10 grid in quadrant 1, a 5x5 grid of circles in quadrant 2, a black to white gradient in quadrant 3, and a flower in quadrant 4
 */

public class Sketch extends PApplet {
	
 
  public void settings() {
    size(1000, 1000);
  }

  // Declare initial x value for gradient lines
  float gradientLineX = 0;

  // Declare count variable for Grid lines
  int countX = 0;
  int countY = 0;
  
  public void setup() {
    background(255, 255, 255);
  }
  
  public void draw() {
    
    // Intial stroke color
    stroke(0, 0, 0);

    // Draw 9x9 Grid Horizontal Lines
	  for (int lineX = width / 20; lineX < width / 2; lineX += width / 20) {
      if (countX < 9){
        line(lineX, 0, lineX, width / 2);
        countX++;
      }
    }

    // Draw 9x9 Grid Vertical Lines
    for (int lineY = height / 20; lineY < height / 2; lineY += height / 20) {
      if (countY < 9){
        line(0, lineY, width / 2, lineY);
        countY++;
      }
    }

    // Draw 5x5 circles
    fill(50, 20, 50);
    for (int circleX = width / 2 + width / 16; circleX < width - width / 16; circleX += width / 10.7){
      for (int circleY = width / 16; circleY < width / 2 - width / 16; circleY += width / 10.7){
        ellipse(circleX, circleY, height / 16, height / 16);
      }
    }
    
    // Draw Gradient 
    float lineWidth = (float)(width / 2) / 255;
    for (int gradientX = 0; gradientX < 256; gradientX++){
      stroke(gradientX, gradientX, gradientX);
      strokeWeight(3);
      gradientLineX += lineWidth;
      if (gradientLineX < width / 2) {
        line(gradientLineX, height / 2, gradientLineX, height);
      }
    }
    
    // Draw Flower Pedals
    fill(100, 20, 100);
    stroke(0,0,0);
    translate(width / 2 + width / 4 , height / 2 + height / 4);
    for (int count = 0; count < 9; count++ ) {
      ellipse(0, width / 12, width / 20, height / 6);
      rotate(radians(45));
    }

    // Draw flower Center
    fill (50, 60, 50);
    ellipse(0, 0, width / 8, width / 8);
  }
}
