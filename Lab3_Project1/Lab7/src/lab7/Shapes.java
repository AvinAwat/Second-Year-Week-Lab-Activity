
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

import java.util.Scanner;


public class Shapes {
    
  private  double lenght;
   private  String color;

   
    public double getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void input(Scanner ce){
        System.out.println("Enter the color: ");
        setColor(ce.next());
        System.out.println("Enter the length: ");
        setLenght((int) ce.nextDouble());
    }

    
    public void display(){
    System.out.println("---------------------------------");
        System.out.println("Shape Information:");
        System.out.printf(" Color   : %s%n", getColor());
        System.out.printf(" Length  : %.2f%n", getLenght());
        
   
    }
    
}
