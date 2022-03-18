/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaherencia2;

public class DatabasePro extends Employee {

    private String databaseTool;

    public void setDatabaseTool(String databaseTool) {
        this.databaseTool = databaseTool;
    }

    public String getDatabaseTool() {
        return databaseTool;
    }

    public DatabasePro() {
    }

    public DatabasePro(String databaseTool) {
        this.databaseTool = databaseTool;
    }

    public DatabasePro(String databaseTool, String name, int age, double salary) {
        super(name, age, salary);
        this.databaseTool = databaseTool;
    }

    public void printData() {

        String cadena;
        cadena = "*******************************************\n";
        cadena = cadena + "\nDatos de Base de datos\n\n";
        cadena = cadena + "Nombre: " + getName() + "\n";
        cadena = cadena + "Edad: " + getAge() + "\n";
        cadena = cadena + "Salario: " + getSalary() + "\n";
        cadena = cadena + "Base de Datos: " + getDatabaseTool() + "\n";
        cadena = cadena + "*******************************************\n";
        System.out.println(cadena);
    }
}
