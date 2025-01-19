/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;

/**
 *
 * @author ariadnasolerbernad
 */
public class DrivingSchool {
    
       // Atributos privados
    private String name;
    private String id;
    private String web;
    private ArrayList<Teacher> teachersList;
    private ArrayList<Employee> employeesList;
    private ArrayList<Student> studentsList;

    
 // Constructor

    public DrivingSchool(String name, String id, String web, ArrayList<Teacher> teachersList, ArrayList<Employee> employeesList, ArrayList<Student> studentsList) {
        this.name = name;
        this.id = id;
        this.web = web;
        this.teachersList = teachersList;
        this.employeesList = employeesList;
        this.studentsList = studentsList;
    }
    
  // Getters y Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public ArrayList<Teacher> getTeachersList() {
        return teachersList;
    }

    public void setTeachersList(ArrayList<Teacher> teachersList) {
        this.teachersList = teachersList;
    }

    public ArrayList<Employee> getEmployeesList() {
        return employeesList;
    }

    public void setEmployeesList(ArrayList<Employee> employeesList) {
        this.employeesList = employeesList;
    }

    public ArrayList<Student> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(ArrayList<Student> studentsList) {
        this.studentsList = studentsList;
    }

    // Métodos para añadir elementos
    public void addStudent(Student student) {
        this.studentsList.add(student);
    }

    public void addTeacher(Teacher teacher) {
        this.teachersList.add(teacher);
    }

    public void addEmployee(Employee employee) {
        this.employeesList.add(employee);
    }

    // Métodos para eliminar elementos
    public void removeStudent(Student student) {
        this.studentsList.remove(student);
    }

    public void removeTeacher(Teacher teacher) {
        this.teachersList.remove(teacher);
    }

    public void removeEmployee(Employee employee) {
        this.employeesList.remove(employee);
    }

    // Listar estudiantes
    public String listStudents() {
        StringBuilder sb = new StringBuilder("Students:\n");
        for (Student student : studentsList) {
            sb.append(student.toString()).append("\n");
        }
        return sb.toString();
    }

    // Listar profesores
    public String listTeacher() {
        StringBuilder sb = new StringBuilder("Teachers:\n");
        for (Teacher teacher : teachersList) {
            sb.append(teacher).append("\n");
        }
        return sb.toString();
    }

    // Listar empleados
    public String listEmployees() {
        StringBuilder sb = new StringBuilder("Employees:\n");
        for (Employee employee : employeesList) {
            sb.append(employee).append("\n");
        }
        return sb.toString();
    }

    // Estudiantes con prácticas pendientes
    public String studentsWithPracticalPending() {
        // Simulación: asume que ClassStudent tiene un método isPracticalPending()
        StringBuilder sb = new StringBuilder("Students with Practical Pending:\n");
        for (Student student : studentsList) {
            if (/* student.isPracticalPending() */ true) { // Simulación
                sb.append(student).append("\n");
            }
        }
        return sb.toString();
    }

    // Calcular ingresos
    public double calculateRevenue() {
        double revenue = 0;
        for (Student student : studentsList) {
            // Simulación: asume que ClassStudent tiene un método getPayment()
            // revenue += student.getPayment();
            revenue += 100; // Valor fijo para simulación
        }
        return revenue;
    }

    // Calcular gastos
    public double calculateExpenses() {
        double expenses = 0;
        for (Employee employee : employeesList) {
            expenses += employee.getSalary();
        }
        for (Teacher teacher : teachersList) {
            // Simulación: asume que ClassTeacher tiene un método getSalary()
            // expenses += teacher.getSalary();
            expenses += 1500; // Valor fijo para simulación
        }
        return expenses;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DrivingSchool{");
        sb.append("name=").append(name);
        sb.append(", id=").append(id);
        sb.append(", web=").append(web);
        sb.append(", teachersList=").append(teachersList);
        sb.append(", employeesList=").append(employeesList);
        sb.append(", studentsList=").append(studentsList);
        sb.append('}');
        return sb.toString();
    }
   
}
