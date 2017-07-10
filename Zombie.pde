int x= 105;
int y= 135;
int x2= 90;
int y2= 120;
void setup(){
  size(300,350);
PImage cat= loadImage("SCats.jpg");
cat.resize(300, 350);
background(cat);



}

void draw(){
  ellipse(x,y, 30,30);
  ellipse(x2,y2,30,30);
  
}