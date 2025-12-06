/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5;


public class Lab5 {

    
    public static void main(String[] args) {
        
       Student s1 = new Student(1, "Avin", 2);
        Student s2 = new Student(2, "Lana", 3);
        Student s3 = new Student(3, "Ali", 2);
        Student s4 = new Student(4, "Sara", 1);

      
        printStudent(s1);
        printStudent(s2);
        printStudent(s3);
        printStudent(s4);
    }

    
    public static void printStudent(Student s) {
        System.out.println("StudentID:"+ s.getStudentID());
        System.out.println("StudentName:"+ s.getStudentName());
        System.out.println("Department:"+ s.getDepartment());
        System.out.println("Semester:"+ s.getSemester());
        System.out.println("**************");
    }
 
        
        
    
    
}
