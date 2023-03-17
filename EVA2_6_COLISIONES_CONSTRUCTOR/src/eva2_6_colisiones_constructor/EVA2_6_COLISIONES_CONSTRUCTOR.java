/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_colisiones_constructor;

/**
 *
 * @author migue
 */
public class EVA2_6_COLISIONES_CONSTRUCTOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Animal");
        Animal animal = new Animal();
        animal.comer();
        animal.respirar();
        
        System.out.println("----------------------------");
        
        System.out.println("Mamifero");
        Mamifero mamifero = new Mamifero();
        mamifero.comer();
        mamifero.respirar();
    }
    
}
