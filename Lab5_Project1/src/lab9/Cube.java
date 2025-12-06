/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9;

import java.util.Scanner;

public class Cube extends Rectangle {

 private double side;
 private double area;
 private double volume;
 
  @Override
    public void input(Scanner sc) {
        System.out.println("Enter cube side length:");
        side=sc.nextDouble();
    }
    @Override
    public void Area() {
     area= 6 * side * side;
        System.out.println("Cube Surface Area="+area);
    }

    @Override
    public void peremeter() {
        System.out.println("Cube has no peremeter (3D object)");
    }

    @Override
    public void resize() {
        side*=2;
        System.out.println("Cube resized *2");
    }
    
 @Override
    public void volume(){
    volume= side * side *side;
    }
 @Override
     public void diplay(){
         System.out.println("---------------------------");
        System.out.println("Cube:");
       System.out.println("Side="+side);
       System.out.println("-----+----------+---------+----");
    }
   
}
