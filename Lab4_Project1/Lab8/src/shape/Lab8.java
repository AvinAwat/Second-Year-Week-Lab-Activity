/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shape;

import java.util.Scanner;

public class Lab8 {

    
    public static void main(String[] args) {
        
       Scanner sc =new Scanner(System.in);
        System.out.println("==================================");
        System.out.println(" Welcome to Shape calculator ");
        System.out.println("==================================");
       
       while(true){
           System.out.println("\nPlease chose a shape:");
           System.out.println("1.Circle");
           System.out.println("2.Cylinder");
           System.out.println("3.Exit");
           System.out.println("Enter your choice:");
       String choice=sc.next();
      
     
       
            switch (choice) {
                case "1":
                    System.out.println("\nyou selected Circle");
                    Circle c = new Circle();
                    c.input(sc);
                    c.display();
                    break;

                case "2":
                    System.out.println("\n you selected Cylinder");
                    Cylinder cy = new Cylinder();
                    cy.input(sc);
                    cy.display();
                    break;

                case "3":
                    System.out.println("\n Thank you for using the shape calculator");
                    System.out.println("Goodbye!");
                    System.out.println("============================================");
                    return; 

                default:
                    System.out.println("Invalid choice!, Please try again");
                    break;
            }
        }

      
}
}