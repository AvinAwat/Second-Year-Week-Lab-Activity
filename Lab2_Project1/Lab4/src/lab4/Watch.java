/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/*
Activity One
•(Watch Class) Create a class called Watch that includes three instance variables-a hour (type int), a
minute (type int) and a second (type int). Provide constructors that initialize the three instance variables
and assumes that the values provided are correct. a get method to return each instance variable's value.
You should use this keyword in member methods and constructor. Write a test application named
WatchTest that demonstrates class Watch's capabilities, create 4 objects for the class Watch and display
the hour, minute, and second separated by(:)
· The output should be as follows:
0:0:0
12:3:0
12:10:2
12:0:0
*/

public class Watch {
    
    
   private int hour;
    private int minute;
    private int second;

    public Watch() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    
    public Watch(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    
    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    
    public void displayTime() {
        System.out.println(this.hour+":"+this.minute+":"+this.second);
    }

}
