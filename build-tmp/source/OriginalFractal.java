import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalFractal extends PApplet {



public void setup(){
	size(600, 600);
		// noLoop();
}
public void draw(){
	background(0);
	fill(255);
	for(int i =0; i< 300; i++){
		fill(0, 0, (int)(Math.random()*100)+155, (int)(Math.random()*50));
		myFractal((int)(Math.random()*600), (int)(Math.random()*600), 50);
	}



}
public void myFractal(int x, int y, int siz)
{
	ellipse(x, y, siz, siz);
	int x1 = x-10;
	if (siz >10){
		myFractal(x1, y, siz - 10);

}

}



//pushMatrix
//translate(x-siz/2, y)
//rotate -pi/4
//myFractal(0, 0, siz/2)
//popMatrix
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalFractal" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
