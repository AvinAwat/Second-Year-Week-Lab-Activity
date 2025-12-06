/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2;

/**
 *
 * @author Excel tech
 */
public class Lab2 {

   
    public static void main(String[] args) {
        
         Desktop pc = new Desktop();

        pc.setBrand("Lenovo");
        pc.setProcessor("Intel i7");
        pc.setRamSize(16);

        System.out.println("Brand: " + pc.getBrand());
        System.out.println("Processor: " + pc.getProcessor());
        System.out.println("RAM: " + pc.getRamSize() + " GB");

        pc.upgradeRam(4);

        System.out.println("After upgrade RAM: " + pc.getRamSize() + " GB");
    

    } 
}
