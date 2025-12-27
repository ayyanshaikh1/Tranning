package Encapculation;


class Circle{
     int radius;
     double area;
     double pi;

     public Circle(double radius, double pi){
         area = pi * radius * radius;
     }

     public void display(){
         System.out.println("Area of Circle " + area);
     }
    }



    public class AreaOfCircle{
     public static void main(String [] args){
         Circle c = new Circle(2,4);
         c.display();
     }
     }
 



