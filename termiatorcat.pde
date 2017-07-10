int x=110;
int y= 115;
int x2=135;
int y2=100;
int acceleration = 1;
void setup(){
  size(200,250);
 PImage catpic=loadImage("thDWL0AVF7.jpg");
catpic.resize(200,250);
background(catpic);
noStroke();
}
void draw(){
  fill(#144D5A);
  ellipse(x,y, 20, 20);
   ellipse(x2,y2, 20, 20);
   
   if(x>width){
     x=110;
     y=115;
     acceleration=1;
   }
   
   if(x<0){
     x= 110;
     y= 115;
     acceleration=1;
   }
   
}
void keyPressed(){
  x+=2*acceleration;
  y+=2*acceleration;
  x2+=2*acceleration++;
  y2+=2*acceleration;
}