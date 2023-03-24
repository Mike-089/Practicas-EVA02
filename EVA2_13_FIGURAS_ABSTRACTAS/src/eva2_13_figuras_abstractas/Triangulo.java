/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_13_figuras_abstractas;

/**
 *
 * @author migue
 */
public class Triangulo extends Figura{
       private double base;
       private double altura;
    
    public Triangulo(){
        this.base = 1;
        this.altura = 1;
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

     public double calcularArea(){
        return (base * altura)/2;
    }
    
    
    
    public double calcularPeri(){
        return base + altura + (Math.sqrt(Math.pow(base, 2)+Math.pow(altura, 2)));
    }
    
   
   
}
