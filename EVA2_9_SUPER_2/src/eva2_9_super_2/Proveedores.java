/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_9_super_2;

/**
 *
 * @author migue
 */
            // Proveedores is-a (es una) persona
public class Proveedores extends Persona{

    private String rfc;

    public Proveedores() {
        super();
        this.rfc = "----------";
    }

    public Proveedores(String name, String apellido, int edad, String rfc) {
        super(name, apellido, edad);
        this.rfc = rfc;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("RFC: " + rfc);
    }
}
