/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author ariadnasolerbernad
 */
public class Teacher extends Employee {
    
        private ArrayList<Student> studentsList;

        //Constructor de clase

        public Teacher(String name, String surname, String id, String email, LocalDate date,float salary, String position) {
         super(name, surname, id, email, date, salary, position);
          this.studentsList = new ArrayList<>();
    }
    //getter
 
   public ArrayList<Student> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(ArrayList<Student> studentsList) {
        this.studentsList = studentsList;
    }

    @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(super.toString()); // Incluye información de Employee
    sb.append("Teacher{");
    sb.append("studentsList=").append(studentsList.isEmpty() ? "No students assigned" : studentsList);
    sb.append(", salary=").append(getSalary());
    sb.append(", position=").append(getPosition());
    sb.append('}');
    return sb.toString();
}
    
    
    
}
