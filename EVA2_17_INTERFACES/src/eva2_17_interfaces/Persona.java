/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_17_interfaces;

/**
 *
 * @author migue
 */
public class Persona implements MostrarDatos {

    private int edad;
    private String nombre;

    public Persona() {
        this.edad = 0;
        this.nombre = "----------";
    }

    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Nmbre: "  + getNombre());
        System.out.println("Edad: " + getEdad());
    }


}
