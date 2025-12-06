/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9;

import java.util.Scanner;


public  class Rectangle extends Shape{
  private double length;
  private double width;
  private double area;
  private double peremeter;
  
  
    @Override
    public void input(Scanner sc) {
        System.out.println("Enter length:");
        length=sc.nextDouble();
        System.out.println("Enter width:");
        width=sc.nextDouble();
    }
    @Override
    public void Area() {
     area=this.length*this.width;  
        System.out.println("Rectangle Area="+area);
    }

    @Override
    public void peremeter() {
        peremeter= 2 * (length + width);
        System.out.println("Rectangle Peremeter="+peremeter);
    }

    @Override
    public void resize() {
        
        length*=2;
        width*=2;
        System.out.println("Rectangle resized *2");
    }
    
  @Override
     public void diplay(){
       super.diplay();
       System.out.println("Rctangle:");
       System.out.println("Length="+length);
       System.out.println("Width="+width);
       System.out.println("---*---------*----------*------");
    
    }


  

   
    
   
}
