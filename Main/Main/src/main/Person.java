/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/*Activity One
• Design a UML Diagram for the Object Person with the private attributed as Name, Age, Country. Then
Convert the UML diagram to java code. Provide public getter and setter methods to access and modify
these variables.*/



public class Person {
    
    
    private String Name;
    public void setName(String name){
    Name=name;
    
    }
    public String getName(){
    return Name;
    }
      
    private String Country;
    public void setCountry(String country){
    Country=country;
   
    }
    public String getCountry(){
    return Country;
    }
    
    private int Age;
    public void setAge(int age){
    Age=age;
    }
    public int getAge(){
    
    return Age;
    }
    
    
    
    
    
}
