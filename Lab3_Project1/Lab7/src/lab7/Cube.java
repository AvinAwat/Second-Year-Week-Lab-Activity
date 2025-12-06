/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

import java.util.Scanner;


public class Cube extends Square {
    
  private double area;
    private double perimeter;
    private double volume;

    

    public double getArea() {
        return area;
    }

    public void setArea() {
       area = 6*Math.pow(getLenght(),2);
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter() {
        perimeter = 12*getLenght();
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume() {
       volume = Math.pow(getLenght(),3);
    }
    @Override
    public void input(Scanner ce){
    super.input(ce);
        setArea();
        setVolume();
        setPerimeter();
    
    }
    
 
  @Override
    public void display(){
        super.display();
        System.out.printf(" Area : %.2f%n", getArea());
        System.out.printf(" Perimeter       : %.2f%n", getPerimeter());
        System.out.printf(" Volume       : %.2f%n", getVolume());
        System.out.println("----------------------------------------");
    }
    
    
}
