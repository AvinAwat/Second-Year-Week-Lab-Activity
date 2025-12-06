/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9;

import java.util.Scanner;


public class Circle extends Shape{
    private double radius;
    private double area;
    private double peremeter;

    @Override
    public void input(Scanner sc) {
        System.out.println("Enter the radius:");
       radius=sc.nextDouble();
    }

  
    @Override
    public void Area() {
        area= Math.PI * radius * radius;
        System.out.println("Circle Area="+area);
    }

    @Override
    public void peremeter() {
        peremeter= 2 *Math.PI *radius;
        System.out.println("Circle Peremeter="+peremeter);
        
    }
      @Override
    public void resize() {
        radius*=2;
          System.out.println("Circle resized *2");
    }
    @Override
     public void diplay(){
         super.diplay();
         System.out.println("Circle:");
         System.out.println("Radius="+radius);
         System.out.println("----&-------&----------&-------");
        
         
    }

   
    
    
  
 
    
    
    
}
