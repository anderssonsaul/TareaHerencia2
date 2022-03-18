/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaherencia2;

/**
 *
 * @author ander
 */
public class Employee {

    private String name;
    private int age;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public Employee() {
    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void printData() {

        String cadena;
        cadena = "*******************************************\n";
        cadena = cadena + "\nDatos de Emplead@\n\n";
        cadena = cadena + "Nombre: " + getName() + "\n";
        cadena = cadena + "Edad: " + getAge() + "\n";
        cadena = cadena + "Salario: " + getSalary() + "\n";
        cadena = cadena + "*******************************************\n";
        System.out.println(cadena);
    }

}
