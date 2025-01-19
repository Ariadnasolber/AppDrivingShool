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

//ABSTRACTA
public abstract class Person {
    

    private String name;
    private String surname;
    private String id;
    private String email;
    private LocalDate date;

    
        // Constructor

    public Person(String name, String surname, String id, String email, LocalDate date) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.email = email;
        this.date = date;
    }

     
        // Getters y Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    
        // Método toString

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Person{");
        sb.append("name=").append(name);
        sb.append(", surname=").append(surname);
        sb.append(", id=").append(id);
        sb.append(", email=").append(email);
        sb.append(", date=").append(date);
        sb.append('}');
        return sb.toString();
    }


}