/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_17_interfaces;

/**
 *
 * @author migue
 */
public class EVA2_17_INTERFACES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // MostrarDatos data = new MostrarDatos();
        
        Persona perso = new Persona(89, "juan");
        perso.imprimirDatos();
        
        Computadora compu = new Computadora("i9",23,34,"supercompu");
        
        compu.imprimirDatos();
    }
}
