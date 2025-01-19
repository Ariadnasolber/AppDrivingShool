/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.time.LocalDate;

/**
 *
 * @author ariadnasolerbernad
 */
public class Employee extends Person{
     // Atributos privados
    private float salary;
    private String position;
    
    // Contructor

    public Employee(String name, String surname, String id, String email, LocalDate date,float salary, String position) {
         super(name, surname, id, email, date);
        this.salary = salary;
        this.position = position;
    }
    
    //Getter y setters

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(super.toString()); // Incluye información de Person
    sb.append("Employee{");
    sb.append("salary=").append(salary);
    sb.append(", position=").append(position);
    sb.append('}');
    return sb.toString();
}
    
    
    
}
