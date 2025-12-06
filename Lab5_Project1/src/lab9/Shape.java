/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9;

import java.util.Scanner;


public abstract class Shape {
    
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    
     public void Draw(){
   }
    public abstract void input (Scanner sc);
    public abstract void resize();
    public abstract void Area();
    public abstract void peremeter();
    
    public void diplay(){
        System.out.println("-----------------------------------");
    
    }

    void volume() {
    }
}
