/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_clases_abstractas_2;

/**
 *
 * @author migue
 */
public class EVA2_14_CLASES_ABSTRACTAS_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante estu = new Estudiante();
        Estudiante estu2 = new Estudiante("Miguel",18,"243234lk");
        
        estu.imprimirDatos();
        System.out.println("--------------------------------------");
        estu2.imprimirDatos();
    
    }
    
}
