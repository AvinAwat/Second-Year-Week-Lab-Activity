/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

/*
Activity Two
 Design a UML Diagram for a real world object Desktop with its attributes as brand, processor, and ramSize.
Every Ram can be upgraded in size for better performance, The desktop should have the ability to perform
the upgrade.
• Convert the UML diagram to a java project which can specify the attributes. Provide public getter and
setter methods to access and modify these variables. Add a method called upgradeRam() that takes an
integer value and increases the ramSize by that value.
*/


public class Desktop {
    
    
      private String brand;
    private String processor;
    private int ramSize;

    
    public String getBrand() {
        return brand;
    }

    public void setBrand(String b) {
        brand = b;
    }

    
    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String p) {
        processor = p;
    }

   
    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int r) {
        ramSize = r;
    }

    
    public void upgradeRam(int value) {
        ramSize = ramSize + value;


    } 
    

    
}
