/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_22_polimorfismo_figuras;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class EVA2_22_POLIMORFISMO_FIGURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    /* Circulo [ ] circ= new Circulo [10];
     // un arreglo en java va de la posicion 0 a la n-1 
     // n es la contidad de elementos del arreglo
     //circ[0] = new Circulo();
     //circ[0].calcularArea();
        for (int i = 0; i < circ.length; i++) {
            circ[i] = new Circulo(i);
            circ[i].imprimirDatos();
            System.out.println("-------------------");
           
        } */
    
    Figuras []figuras; // declaramos un arreglo pero no lo hemos creado
    // con el scanner vamos a capturar la cantidad de figuras a utilizar
    Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas figuras quieres capurar?");
        int cant = sc.nextInt(); // nos permite capturar
        figuras = new Figuras [cant]; // creamos el arreglo con la cantidad de figuras que auiere el usuario
        
        for (int i = 0; i < cant; i++) {
            System.out.println("Captura el tipo de figura: ");
            System.out.println("1. Circulo, 2. Triangulo");
            int figu = sc.nextInt();
            if(figu == 1) {// circulo
                 Circulo circu = new Circulo();
                 figuras [i] = circu;
                 System.out.println("Introduce el radio: ");
                 circu.setRadio(sc.nextDouble());
            }else{// triangulo
                 Triangulo trian = new Triangulo();
                 
                  System.out.println("Introduce la base: ");
                 trian.setBase(sc.nextDouble());
                 System.out.println("Introduce la altura: ");
                 trian.setAltura(sc.nextDouble());
                 figuras [i] = trian;
            }
        }
        
        for (int i = 0; i < figuras.length; i++) {
            if (figuras[i] instanceof Circulo){
                
                Circulo circu = (Circulo) figuras[i];
                circu.imprimirDatos();
            }else{
                 
                 Triangulo trian = (Triangulo) figuras [i];
                 trian.imprimirDatos();
            }
            //System.out.println("Area: " + figuras[i].calcularArea());
            //System.out.println("Perimetro: " + figuras[i].calcularPeri());
            System.out.println("--------------------------------");
            
        }
    }
    
}
