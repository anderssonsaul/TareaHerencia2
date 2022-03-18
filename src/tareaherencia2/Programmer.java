/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaherencia2;

public class Programmer extends Employee {

    private String lenguage;

    public String getLenguage() {
        return lenguage;
    }

    public void setLenguage(String lenguage) {
        this.lenguage = lenguage;
    }

    public Programmer() {
    }

    public Programmer(String lenguage) {
        this.lenguage = lenguage;
    }

    public Programmer(String lenguage, String name, int age, double salary) {
        super(name, age, salary);
        this.lenguage = lenguage;
    }

    public void printData() {

        String cadena;
        cadena = "*******************************************\n";
        cadena = cadena + "\nDatos del Programador\n\n";
        cadena = cadena + "Nombre: " + getName() + "\n";
        cadena = cadena + "Edad: " + getAge() + "\n";
        cadena = cadena + "Salario: " + getSalary() + "\n";
        cadena = cadena + "Lenguaje: " + getLenguage() + "\n";
        cadena = cadena + "*******************************************\n";
        System.out.println(cadena);
    }
}
