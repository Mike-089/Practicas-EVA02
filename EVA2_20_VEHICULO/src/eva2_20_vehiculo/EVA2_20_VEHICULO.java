/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_20_vehiculo;

/**
 *
 * @author migue
 */
public class EVA2_20_VEHICULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automovil auto = new Automovil("Troca","Ford",1999,0,"Fiesta");
        System.out.println("Auto:");
        auto.acele(24);
        auto.acele(57);
        auto.acele(-27);
        auto.acele(89);
        
        auto.imprimirVel();
        System.out.println("-----------------------------");
        
        Bicicleta bici = new Bicicleta();
        System.out.println("Bici:");
        bici.acele(89);
        bici.acele(-20);
        bici.detener();
        bici.imprimirVel();
        
    }
    
}
