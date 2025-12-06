/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab9;

import java.util.Scanner;



public class Lab9 {

   
    public static void main(String[] args) {
        
      Scanner sc= new Scanner(System.in);
        System.out.println("Please Enter the Shapes Informations------>");
      
      Shape s1= new Rectangle();
      s1.input(sc);
      s1.Area();
      s1.peremeter();
      s1.diplay();
      
       Shape s2= new Circle();
       s2.input(sc);
       s2.Area();
       s2.peremeter();
       s2.diplay();
       
       Shape s3= new Cube();
       s3.input(sc);
       s3.Area();
       s3.volume();
       s3.diplay();
                   

    }
    
}
