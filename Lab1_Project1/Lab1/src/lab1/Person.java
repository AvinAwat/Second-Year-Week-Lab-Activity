/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/*
Activity One
• Design a UML Diagram for the Object Person with the private attributed as Name, Age, Country. Then
Convert the UML diagram to java code. Provide public getter and setter methods to access and modify
these variables.
*/
public class Person {
    
    private String name;
    private int age;
    private String country;
    
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getCountry() {
        return country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }

    
    
}
