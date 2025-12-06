
package shape;

import java.util.Scanner;


public class Shape {
    
    public String color;
    public double radius;
    
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
     public void input(Scanner sc){
        System.out.println("Enter the color:");
         setColor(sc.next());
        System.out.println("Enter the radius:");
         setRadius(sc.nextDouble());
}
    
   public void displayInfo(){
         
         System.out.println("**************************************");
    
    
    }
    
}
