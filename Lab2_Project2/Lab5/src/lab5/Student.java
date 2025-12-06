/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;


/*
Activity Two
•(Student Class) Create a class called Student that includes four instance variables-an ID (type int and its
value is 1) and copy its value to the objects, a Department (type String, value is "CS" and it is final), it also
gives its value to the objects, a name(type String), and Semester (type int). Provide constructors that
initialize the instance variables and assumes that the values provided are correct. a get method to return
each instance variable's value. You should use this keyword in member methods and constructor. Write a
test application named StudentTest and create 4 objects for the class Student and display the students
information.
· The output should be as follows:
StudenID: 1
StudentName: yusra
Department: cs
Semester: 3
*/

public class Student {
    
    private int studentID;
    private String studentName;
    private final String department = "CS"; 
    private int semester;

    
    public Student(int studentID, String studentName, int semester) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.semester = semester;
    }

   
    public int getStudentID() {
        return this.studentID;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public String getDepartment() {
        return this.department;
    }

    public int getSemester() {
        return this.semester;
    }

    
    
    
}
