/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape;

import java.util.Scanner;


public class Circle extends Shape {
    
    
    public double area;

    public double getArea() {
        return area;
    }

    public void setArea() {
       area=Math.PI * getRadius() * getRadius();
    }

    @Override
    public void input(Scanner sc){
      super.input(sc);
      setArea();
}

    public void display(){
        super.displayInfo();
        
        System.out.println("----------------------------------------");
        System.out.println("        Shape Information"       );
        System.out.println("----------------------------------------");
        System.out.printf(" Type     : Circle%n");
        System.out.printf(" Color    : %s%n", getColor());
        System.out.printf(" Radius   : %.2f%n", getRadius());
        System.out.println("----------------------------------------");
        System.out.printf(" Area     : %.2f%n", getArea());
        System.out.println("----------------------------------------");
    }


        


}



