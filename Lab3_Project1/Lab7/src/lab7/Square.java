/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

import java.util.Scanner;

        
public class Square extends Shapes {
  
    
    private double area ;
    private double perimeter;

    public double getArea() {
        return area;
    }

    public void setArea() {
        area= Math.pow(getLenght(),2);
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter() {
        perimeter = 4*getLenght();
    }
    @Override
    public void input(Scanner ce){
    super.input(ce);
       setArea();
       setPerimeter();
    
    }

    @Override
    public void display(){
      super.display();
        System.out.printf(" Area    : %.2f%n", getArea());
        System.out.printf(" Perimeter: %.2f%n", getPerimeter());
        System.out.println("----------------------------------------");
    
    
    }

   
    
    
}
