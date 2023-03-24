/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_9_super_2;

/**
 *
 * @author migue
 */
            // Docentes is-a (es una) persona
public class Docentes extends Persona{
    private String plaza;
    
      public Docentes(){
        super();
        this.plaza = "----------";
    }

    public Docentes(String name, String apellido, int edad, String plaza) {
        super(name, apellido, edad);
        this.plaza = plaza;
    }

    public String getPlaza() {
        return plaza;
    }

    public void setPlaza(String Plaza) {
        this.plaza = plaza;
    }

    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Plaza: " + plaza);
    }
    
    
}
