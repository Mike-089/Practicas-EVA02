/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_22_polimorfismo_figuras;

/**
 *
 * @author migue
 */
public class Circulo implements Figuras, MostrarDatos{
    private double radio;
    
    public Circulo(){
        this.radio = 1;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
    

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double calcularArea(){
        return Math.PI * (radio*radio);
    }
    @Override
    
    public double calcularPeri(){
        return Math.PI * (2*radio);
    }
    
    @Override
       public void imprimirDatos() {
        System.out.println("Circulo: ");
        System.out.println("Radio: " + radio);
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPeri());
    }
       
}
