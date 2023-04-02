/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Productos;

import SuperClases.Electronica;

/**
 *
 * @author migue
 */
public final class Computadora extends Electronica {

    private float tamano;
    private int memoria;
    private String procesador;
    private String dd;

    public Computadora() {
        super();
        this.tamano = 0;
        this.memoria = 0;
        this.procesador = "";
        this.dd = "";
    }

    public Computadora(double precio, String nombre, String unidad, String fabricante, String modelo, int garantia, float tamano, int memoria, String procesador, String dd) {
        super(precio, nombre, unidad, fabricante, modelo, garantia);
        this.tamano = tamano;
        this.memoria = memoria;
        this.procesador = procesador;
        this.dd = dd;
    }

    public float getTamano() {
        return tamano;
    }

    public void setTamano(float tamano) {
        this.tamano = tamano;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getDd() {
        return dd;
    }

    public void setDd(String dd) {
        this.dd = dd;
    }

    @Override

    public double precioVenta(int cant) {
        // 10 unidades --> el precio es del 80%
        if (cant < 10) 
            return precio * cant;
        else
            return (precio * 0.8) *cant;
        
    }
    @Override
           public String toString(){
        String cade =  super.toString() 
                + "Tamaño:  " + tamano + "\n"
                + "Memoria: " + memoria + "\n"
                + "Procesador: " + procesador + "\n"
                + "Disco duro: " + dd + "\n";
        return cade;
    }

}
//Computadora es una clase final
//ya no se puede heredar de una clase final
//class Laptop extends Computadora{

//}
