/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_15_tienda;

import Productos.Computadora;
import Productos.Playera;

/**
 *
 * @author migue
 */
public class EVA2_15_TIENDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Computadora compu = new Computadora(2300,"zi","45","Lenovo","z1 pro",2,15,8,"i3","500GB");
        Playera playe = new Playera();
        
        System.out.println(compu.toString());
        System.out.println(playe.toString());
        
    }
    
}

