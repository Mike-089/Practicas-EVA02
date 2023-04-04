/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_20_vehiculo;

/**
 *
 * @author migue
 */
public abstract class Vehiculo implements ControlVelocidad{

    protected int vel;    
    private String marca;

    public Vehiculo() {
        this.vel = 0;
        this.marca = "---";
    }
    
    public Vehiculo(int vel, String marca) {
        this.vel = vel;
        this.marca = marca;
    }

    public int getVel() {
        return vel;
    }

    public void setVel(int vel) {
        this.vel = vel;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    

    @Override
    public int acele(int ace) {
        return vel = vel +ace;
    }

    /**
     *
     */
    @Override
    public void detener() {
       vel= 0;
    }

    @Override
    public void imprimirVel() {
        System.out.println("Velocidad: " + vel);
    }
    
}
