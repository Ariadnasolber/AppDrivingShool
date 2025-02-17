package model;
import java.util.ArrayList;

public class DrivingSchool {
    
    private String name;
    private String id;
    private String web;
    private ArrayList<Teacher> teachersList;
    private ArrayList<Employee> employeesList;
    private ArrayList<Student> studentsList;

    public DrivingSchool(String name, String id, String web, ArrayList<Teacher> teachersList, ArrayList<Employee> employeesList, ArrayList<Student> studentsList) {
        this.name = name;
        this.id = id;
        this.web = web;
        this.teachersList = teachersList;
        this.employeesList = employeesList;
        this.studentsList = studentsList;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getWeb() {
        return web;
    }

    public ArrayList<Teacher> getTeachersList() {
        return teachersList;
    }

    public ArrayList<Employee> getEmployeesList() {
        return employeesList;
    }

    public ArrayList<Student> getStudentsList() {
        return studentsList;
    }

    public void addStudent(Student student) {
        this.studentsList.add(student);
    }

    public void addTeacher(Teacher teacher) {
        this.teachersList.add(teacher);
    }

    public void addEmployee(Employee employee) {
        this.employeesList.add(employee);
    }

    public void removeStudent(Student student) {
        this.studentsList.remove(student);
    }

    public void removeTeacher(Teacher teacher) {
        this.teachersList.remove(teacher);
    }

    public void removeEmployee(Employee employee) {
        this.employeesList.remove(employee);
    }

    public String listStudents() {
        StringBuilder sb = new StringBuilder("Students:\n");
        for (Student student : studentsList) {
            sb.append(student.toString()).append("\n");
        }
        return sb.toString();
    }

    public String listTeacher() {
        StringBuilder sb = new StringBuilder("Teachers:\n");
        for (Teacher teacher : teachersList) {
            sb.append(teacher).append("\n");
        }
        return sb.toString();
    }

    public String listEmployees() {
        StringBuilder sb = new StringBuilder("Employees:\n");
        for (Employee employee : employeesList) {
            sb.append(employee).append("\n");
        }
        return sb.toString();
    }

    public String studentsWithPracticalPending() {
        StringBuilder sb = new StringBuilder("Students with Practical Pending:\n");
        for (Student student : studentsList) {
            if (/* student.isPracticalPending() */ true) {
                sb.append(student).append("\n");
            }
        }
        return sb.toString();
    }

    public double calculateRevenue() {
        double revenue = 0;
        for (Student student : studentsList) {
            revenue += student.getRegistrationFee();
        }
        return revenue;
    }

    public double calculateExpenses() {
        double expenses = 0;
        for (Employee employee : employeesList) {
            expenses += employee.getSalary();
        }
        for (Teacher teacher : teachersList) {
            expenses += teacher.getSalary();
        }
        return expenses;
    }

    public String listApprovedStudents() {
        StringBuilder sb = new StringBuilder("Approved Students:\n");
        for (Student student : studentsList) {
            if (student.getApprovalStatus() == 1) {
                sb.append(student).append("\n");
            }
        }
        return sb.toString();
    }

    public String listNotApprovedStudents() {
        StringBuilder sb = new StringBuilder("Not Approved Students:\n");
        for (Student student : studentsList) {
            if (student.getApprovalStatus() == 0) {
                sb.append(student).append("\n");
            }
        }
        return sb.toString();
    }
}
