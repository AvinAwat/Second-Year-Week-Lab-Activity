/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4;

/**
 *
 * @author Excel tech
 */
public class Lab4 {

   
    public static void main(String[] args) {
       
        
          Watch myWatch = new Watch(); 

        
        myWatch.setHour(10);
        myWatch.setMinute(25);
        myWatch.setSecond(45);

        myWatch.displayTime();

        
        Watch w2 = new Watch();
        w2.setHour(12);
        w2.setMinute(3);
        w2.setSecond(0);
        
         w2.displayTime();
         
        Watch w3 = new Watch(12, 10, 2);
        Watch w4 = new Watch(12, 0, 0);

        w3.displayTime();
        w4.displayTime();

    }
    
}
