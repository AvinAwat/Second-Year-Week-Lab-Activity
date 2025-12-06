/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab7;

import java.util.Scanner;



public class Lab7 {

    
    public static void main(String[] args) {
        
        Scanner ce =new Scanner(System.in);
        
        while(true){
   
        System.out.println("\n==========================");
        System.out.println("    Shape Calculator"   );
        System.out.println("\n==========================");
        
            System.out.println(" 1.Creat Square");
            System.out.println(" 2.Creat Cube");
            System.out.println(" 3.Exit");
            System.out.println(" Enter your choice:");
            
            String choice =ce.next();
            
             switch (choice) {
                case "1":
                    System.out.println("\n You selected: Square");
                    Square s = new Square();
                s.input(ce);
                    s.display();
                    break;

                case "2":
                    System.out.println("\n You selected: Cube");
                    Cube c = new Cube();
                   c.input(ce);
                   c.display();
                    break;

                case "3":
                    System.out.println("\n Thank you for using the Shape Calculator!");
                    return;

                default:
                    System.out.println(" Invalid choice! Please try again.");
                    break;
            }
        }
        
        
        
        
        }
        
        
        
    }
    

