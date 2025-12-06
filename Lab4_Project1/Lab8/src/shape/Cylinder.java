/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape;

import java.util.Scanner;


public class Cylinder extends Shape{
    
    public double height;
    public double area;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return area;
    }

    public void setArea() {
        area= (2* Math.PI * getRadius() * getRadius()) +  (2* Math.PI * getRadius()*getHeight());
    }
    
   

    @Override
     public void input(Scanner sc){
         System.out.println("Enter the color:");
          setColor(sc.next());
         System.out.println("Enter the radius:");
         setRadius(sc.nextDouble());
         System.out.println("Enter the height:");
         setHeight(sc.nextDouble());
         setArea();
}
     
     public void display(){
         super.displayInfo();
     
          
        System.out.println("----------------------------------------");
        System.out.println("       Shape Information"       );
        System.out.println("----------------------------------------");
        System.out.printf(" Type     : Cylinder%n");
        System.out.printf(" Color    : %s%n", getColor());
        System.out.printf(" Radius   : %.2f%n", getRadius());
        System.out.printf(" Height   : %.2f%n", getHeight());
        System.out.println("----------------------------------------");
        System.out.printf(" Surface Area : %.2f%n", getArea());
        System.out.println("----------------------------------------");
    }
}
     
     
     

