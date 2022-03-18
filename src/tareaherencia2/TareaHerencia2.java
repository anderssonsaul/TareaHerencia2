/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareaherencia2;

public class TareaHerencia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        DatabasePro databasePro = new DatabasePro();

        programmer.setName("Miguel Catalan");
        programmer.setAge(25);
        programmer.setSalary(15000);
        programmer.setLenguage("Java");
        programmer.printData();

        databasePro.setName("Miguel Catalan");
        databasePro.setAge(26);
        databasePro.setSalary(16000);
        databasePro.setDatabaseTool("SQL");
        databasePro.printData();

    }

}
