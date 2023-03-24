/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_super_2;

/**
 *
 * @author migue
 */
public class EVA2_9_SUPER_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante estu = new Estudiante("Miguel","caballero",18,"4234525");
        /*estu.setName("Juan");
        estu.setApellido("Perez");
        estu.setEdad(20);
        estu.setNoControl("3453279");
        */
        
        estu.imprimirDatos();
        
        System.out.println("----------------------------------");
        
        Proveedores prove = new Proveedores();
        prove.setName("Paco");
        prove.setApellido("Peña");
        prove.setEdad(45);
        prove.setRfc("3iterk");
        
        prove.imprimirDatos();
        
        System.out.println("----------------------------------");
        
        Docentes doce = new Docentes();
        doce.imprimirDatos();
    }
    
}
