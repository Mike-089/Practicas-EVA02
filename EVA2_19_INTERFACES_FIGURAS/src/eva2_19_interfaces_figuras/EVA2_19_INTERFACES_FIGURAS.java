/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_19_interfaces_figuras;

/**
 *
 * @author migue
 */
public class EVA2_19_INTERFACES_FIGURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // No se puede instanciar
        //Figuras figura = new figuras();
        //MostrarDatos mostrar = new MostrarDatos();
        Circulo circ = new Circulo(20);
        circ.imprimirDatos();
        
        System.out.println("-------------------------------------");
        
        Triangulo trian = new Triangulo();
        trian.setBase(3);
        trian.setAltura(4);
        trian.imprimirDatos();
    }
    
}
