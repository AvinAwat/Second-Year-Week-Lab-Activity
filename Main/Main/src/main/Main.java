/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author Excel tech
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Person obj=new Person();
        obj.setName("Avin");
        System.out.println("the name is:"+obj.getName());
        
        Person obj1=new Person();
      obj1.setAge(20);
        System.out.println("the age is:"+obj1.getAge());
        
        Person obj2=new Person();
        obj2.setCountry("slimany");
        System.out.println("the country is:"+obj2.getCountry());
        
    }
    
}
