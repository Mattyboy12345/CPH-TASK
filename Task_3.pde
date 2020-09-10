// task 3.a
//3.a Draw a traffic light using colors stored in variables - one for each of the 4 colors (background is the 4th).



color r=color(255,0,0);
color gu=color(255,255,0);
color g=color(0,255,0);


void setup(){
size(300,300);
}
void draw(){
 // trafik lysets krop
fill(0,0,0);
rect(100,50,100,200);
 
//rød lys
 if (keyPressed) {
    if (key == 'b' || key == 'B'){ 
   fill(128,128,128);
    }
 } 
   else{
fill(r);
   }
ellipse(150,90,50,50);
 
 
//gult lys

if (keyPressed) {
    if (key == 't' || key == 'T'){ 
   fill(128,128,128);
    }
 } 
   else{
fill(gu);
   }
ellipse(150,150,50,50);

//grønt lys

fill(g);
   
ellipse(150,210,50,50);

}
//3.b add a gray color for the turned off effect
//fill(128,128,128);

//3.c have the light turn on/off (green or red) by pressing keys on the keyboard.
