/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_extends;

/**
 *
 * @author migue
 */
public class EVA2_3_EXTENDS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante estu = new Estudiante();
        estu.setName("Juan");
        estu.setApellido("Perez");
        estu.setEdad(20);
        estu.setNoControl("3453279");
        
        System.out.println("Imprimir datos estudiante: ");
        System.out.println("Nombre: " + estu.getName());
        System.out.println("Apellido: " + estu.getApellido());
        System.out.println("Edad: " + estu.getEdad());
        System.out.println("No. control: " + estu.getNoControl());
     
        System.out.println("----------------------------------");
        
        Proveedores prove = new Proveedores();
        prove.setName("Paco");
        prove.setApellido("Peña");
        prove.setEdad(45);
        prove.setRfc("3iterk");
        
        System.out.println("Imprimir datos proveedor: ");
        System.out.println("Nombre: " + prove.getName());
        System.out.println("Apellido: " + prove.getApellido());
        System.out.println("Edad: " + prove.getEdad());
        System.out.println("RFC: " + prove.getRfc());
    }
    
}
