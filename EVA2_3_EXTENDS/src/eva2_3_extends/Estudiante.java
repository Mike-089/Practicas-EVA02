/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_3_extends;

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

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String nocontrol) {
        this.noControl = nocontrol;
    }
}
