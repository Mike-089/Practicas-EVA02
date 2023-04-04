/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_23_polimorfismo_vehiculos;

/**
 *
 * @author migue
 */
public class EVA2_23_POLIMORFISMO_VEHICULOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automovil auto = new Automovil("Tesla",  "x", 2020,  0);
        cambiarVelocidad(auto, 20);
        
        Bicicleta bici = new Bicicleta("montaña","nose", 0, "nisan");
        cambiarVelocidad(bici,20);
        Object obj = auto;
    }
    
    public static void cambiarVelocidad( DatosVehiculo vehi, int vel){
        vehi.acelerar(vel);
        vehi.tablero();
    }
    
}

interface DatosVehiculo{
    void acelerar(int cambio);
    void tablero();
}

class Automovil extends Vehiculo implements DatosVehiculo{
   
    private String modelo;
    private int  año;

    public Automovil() {
       super();
        this.modelo = "------";
        this.año = 0;
    }
    
    public Automovil(String marca, String modelo, int año , int velocidad) {
        super(velocidad, marca);
        this.modelo = modelo;
        this.año = año;
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

    @Override
    public void acelerar(int cambio) {
        int cambioVel = velocidad + cambio;
        if(cambioVel >=0)// aceptar solo velocidades positivas
             velocidad = cambioVel; // velocidad = velocidad + cambio; <-- acomulador
        
    }

    @Override
    public void tablero() {
        System.out.println("Velocidad del automovil:" + getVelocidad());
    }
    
}

class Vehiculo{
    protected int velocidad;
     private String marca;
     
     public Vehiculo() {
        this.velocidad = 0;
        this.marca = "---";
    }

    public Vehiculo(int velocidad, String marca) {
        this.velocidad = velocidad;
        this.marca = marca;
    }
     
      public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
 // la velocidad se modificara con velocidad
    public int getVelocidad() {
        return velocidad;
    }
}

class Bicicleta extends Vehiculo implements DatosVehiculo{
    private String tipo;
    private String rodada;

    public Bicicleta() {
        super();
        this.tipo = "-------";
        this.rodada = "-----";
    }

    public Bicicleta(String tipo, String rodada, int velocidad, String marca) {
        super(velocidad, marca);
        this.tipo = tipo;
        this.rodada = rodada;
    }
    
    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRodada() {
        return rodada;
    }

    public void setRodada(String rodada) {
        this.rodada = rodada;
    }

    @Override
    public void acelerar(int cambio) {
        int cambioVel = velocidad + cambio;
        if(cambioVel >=0)// aceptar solo velocidades positivas
             velocidad = cambioVel; // velocidad = velocidad + cambio; <-- acomulador
        
    }

    @Override
    public void tablero() {
        System.out.println("Velocidad de la bici:" + getVelocidad());
    }
    
    
}