/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_figuras_abstractas;

/**
 *
 * @author migue
 */
public class EVA2_13_FIGURAS_ABSTRACTAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Figura fig = new Figura();
        Circulo circu = new Circulo(2);
        Triangulo trian = new Triangulo(4,3);
        
        System.out.println("Circulo: ");
        System.out.println("Area: " + circu.calcularArea());
        System.out.println("Circunferencia: " + circu.calcularPeri());
        System.out.println("-----------------------------------");
        
        System.out.println("Triangulo: ");
        System.out.println("Area: " + trian.calcularArea());
        System.out.println("Perimetro: " + trian.calcularPeri());
    }
    
}
