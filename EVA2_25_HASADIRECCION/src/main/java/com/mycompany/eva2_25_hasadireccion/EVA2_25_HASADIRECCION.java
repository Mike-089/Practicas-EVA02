/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.eva2_25_hasadireccion;

/**
 *
 * @author migue
 */
public class EVA2_25_HASADIRECCION {

    public static void main(String[] args) {
        
        Persona persona = new Persona();
        persona.setNombre("Miguel");
        persona.setApellido("Caballero");
        persona.setEdad(18);
        
       Direccion direccion = new Direccion();
        direccion.setCalle("Industrias");
        direccion.setNumero(1001001);
        direccion.setFcolonia("Complejo industrial Chihuahua");
        direccion.setCp("31135");
        direccion.setCiudad("Chihuahua");
        direccion.setEstado("Chihuahua");
        persona.setDireccion(direccion);
      
        persona.imprimirdatos();
        
    }
}

class Direccion {

    private String calle;
    private int numero;
    private String fcolonia;
    private String cp;
    private String ciudad;
    private String estado;

    public Direccion() {
        this.calle = "---";
        this.numero = 0;
        this.fcolonia = "---------";
        this.cp = "--------";
        this.ciudad = "------";
        this.estado = "---------";
    }

    public Direccion(String calle, int numero, String fcolonia, String cp, String ciudad, String estado) {
        this.calle = calle;
        this.numero = numero;
        this.fcolonia = fcolonia;
        this.cp = cp;
        this.ciudad = ciudad;
        this.estado = estado;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFcolonia() {
        return fcolonia;
    }

    public void setFcolonia(String fcolonia) {
        this.fcolonia = fcolonia;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void imprimirDatos() {
        System.out.println("Direccion: ");
        System.out.println(calle + " #" + numero + ", " + fcolonia + "\nC.P. " + cp + ", " + ciudad + ", " + estado);
    }
}

class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private Direccion direccion;

    public Persona() {
        this.nombre = "-------";
        this.apellido = "-------";
        this.edad = 0;
        this.direccion = null; // no existe el objeto direccion
    }

    public Persona(String nombre, String apellido, int edad, Direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    public void imprimirdatos(){
        System.out.println("Persona: ");
        System.out.println(nombre + " "+ apellido + " " + edad + "  años");
         if(direccion == null)
            System.out.println("Sin direccion: ");
       else
        direccion.imprimirDatos();
    }

}

class Sucursal{
    private String nombreSucursal;
    private Direccion direccion;
    
}