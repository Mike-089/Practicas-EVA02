/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_20_vehiculo;

/**
 *
 * @author migue
 */
public class Automovil extends Vehiculo {
   private String tipoAuto;
   private String modelo;
   private int año;

    public Automovil() {
        super();
        this.tipoAuto = "--------";
        this.modelo = "--------";
        this.año = 0;
    }

    public Automovil(String tipoAuto, String modelo, int año, int vel, String marca) {
        super(vel, marca);
        this.tipoAuto = tipoAuto;
        this.modelo = modelo;
        this.año = año;
    }

    public String getTipoAuto() {
        return tipoAuto;
    }

    public void setTipoAuto(String tipoAuto) {
        this.tipoAuto = tipoAuto;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getVel() {
        return vel;
    }

    public void setVel(int vel) {
        this.vel = vel;
    }
   

  
}

