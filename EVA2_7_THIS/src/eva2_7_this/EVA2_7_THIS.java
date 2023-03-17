/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_7_this;

/**
 *
 * @author migue
 */
public class EVA2_7_THIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //imprimir();
        //No se puede usar en un contexto estatico
    }
    public void imprimir(){
        // aqui tambien es visible imprimir
    }
}


// this es una referncia a una instancia de la clase
// todos los objetos tinene this
// puedes usar this en cualquier clase
// this solo existe interno dentro del objeto
class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
        // this.nombre es el atributo de la clase 
        // nombre es la variable (parametro) declarado en el metodo
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void imprimirDatos(){
        System.out.println("El nombre es: " + this.nombre);
    }
    
}