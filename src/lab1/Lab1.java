/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1;


public class Lab1 {

    
    public static void main(String[] args) {
        
         Person person = new Person();
        
        
        person.setName("Avin");
        person.setAge(20);
        person.setCountry("Sulaimani");
        
        
        System.out.println("Name:" + person.getName());
        System.out.println("Age:" + person.getAge());
        System.out.println("Country:" + person.getCountry());
        
        
        person.setAge(19);
        person.setCountry("Hawler");
        
        System.out.println("After changing:");
        System.out.println("New Name:" + person.getAge());
        System.out.println("New country: " + person.getCountry());
    }

    
    
}
