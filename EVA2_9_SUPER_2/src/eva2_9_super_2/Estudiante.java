/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_9_super_2;

/**
 *
 * @author migue
 */
            //Calse derivada extends Clase Base 
            //subclase extends Suoerclase
            //hijo extends Padre

            // Estudiante is-a (es una) persona
public class Estudiante extends Persona{
    private String noControl;
    
    public Estudiante(){
        super();
        this.noControl = "----------";
    }

    public Estudiante(String name, String apellido, int edad, String noControl) {
        super(name, apellido, edad);
        this.noControl = noControl;
    }
    
    
    
    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String nocontrol) {
        this.noControl = nocontrol;
    }
    
    //OVERRIDE: reemplaza el metodo (con la misma firma) en la
    //superclase, en este caso, reemplaza a imprimirDatos() de Persona

    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("No.control: " + noControl);
    }
}
