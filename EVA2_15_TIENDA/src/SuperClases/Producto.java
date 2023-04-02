/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SuperClases;

/**
 *
 * @author migue
 */
public abstract class Producto {

    protected double precio;
    private String nombre;
    private String unidad;

    public Producto() {
        this.precio = 0;
        this.nombre = "";
        this.unidad = "";
    }

    public Producto(double precio, String nombre, String unidad) {
        this.precio = precio;
        this.nombre = nombre;
        this.unidad = unidad;
    }
    
    

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
    
    public abstract double precioVenta(int cant);
    
    @Override
    public String toString(){
        String cade = "Datos \n"
                + "Nombre: " + nombre + "\n"
                + "Precio: " + precio + "\n"
                + "Unidad: " + unidad + "\n";
        return cade;
    }
}
