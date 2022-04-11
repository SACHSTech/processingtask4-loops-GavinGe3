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
  float fltGradientintLineX = 0;

  // Declare count variable for Grid lines
  int intCountX = 0;
  int intCountY = 0;

  public void draw() {

    // Set initial stroke color and weight
    stroke(0, 0, 0);
    strokeWeight(3);

    // Quadrant 1: Draw 10x10 Grid Horizontal Lines
	  for (int intLineX = width / 20; intLineX < width / 2; intLineX += width / 20) {
      if (intCountX < 9){
        line(intLineX, 0, intLineX, width / 2);
        intCountX++;
      }
    }

    // Quadrant 1: Draw 10x10 Grid Vertical Lines
    for (int intLineY = height / 20; intLineY < height / 2; intLineY += height / 20) {
      if (intCountY < 9){
        line(0, intLineY, width / 2, intLineY);
        intCountY++;
      }
    }

    // Quadrant 2: Draw 5x5 circles
    fill(212, 15, 125);
    for (int intCircleX = width / 2 + width / 16; intCircleX < width - width / 16; intCircleX += width / 10.7){
      for (int intCircleY = height / 16; intCircleY < height / 2 - height / 16; intCircleY += height / 10.7){
        ellipse(intCircleX, intCircleY, height / 16, height / 16);
      }
    }
    
    // Quadrant 3: Draw Gradient 
    for (int intGradientColour = 0;  intGradientColour < 256;  intGradientColour++){
      stroke(intGradientColour, intGradientColour, intGradientColour);
      fltGradientintLineX += (float)(width / 2) / 255;;
      if (fltGradientintLineX < width / 2) {
        line(fltGradientintLineX, height / 2, fltGradientintLineX, height);
      }
    }
    
    // Quadrant 4: Draw Flower Pedals
    stroke(0, 0, 0);
    translate(width / 2 + width / 4 , height / 2 + height / 4);
    for (int intPedalCount = 0; intPedalCount < 9; intPedalCount++ ) {
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
