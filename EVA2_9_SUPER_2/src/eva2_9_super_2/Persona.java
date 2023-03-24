/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_9_super_2;

/**
 *
 * @author migue
 */
public class Persona {
    
    private String name;
    private String apellido;
    private int edad;
    
    public Persona(){
        this.name = "-----";
        this.apellido = "-----";
        this.edad = -1;
    }

    public Persona(String name, String apellido, int edad) {
        this.name = name;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void imprimirDatos() {
        System.out.println("Datos:");
        System.out.println("Nombre: " + this.name);
        System.out.println("Apillidos: " + this.apellido);
        System.out.println("Edad: " + this.edad);
    }

}
