/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_20_vehiculo;

/**
 *
 * @author migue
 */
public class Bicicleta  extends Vehiculo {
    private String tipoVici;
    private String tamañoVici;

    public Bicicleta() {
        super();
        this.tipoVici = "-------";
        this.tamañoVici = "----------";
    }

    public Bicicleta(String tipoVici, String tamañoVici, int vel, String marca) {
        super(vel, marca);
        this.tipoVici = tipoVici;
        this.tamañoVici = tamañoVici;
    }

    public String getTipoVici() {
        return tipoVici;
    }

    public void setTipoVici(String tipoVici) {
        this.tipoVici = tipoVici;
    }

    public String getTamañoVici() {
        return tamañoVici;
    }

    public void setTamañoVici(String tamañoVici) {
        this.tamañoVici = tamañoVici;
    }

    public int getVel() {
        return vel;
    }

    public void setVel(int vel) {
        this.vel = vel;
    }
    

    
}
