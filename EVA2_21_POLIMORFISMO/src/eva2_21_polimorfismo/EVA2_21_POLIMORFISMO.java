/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_21_polimorfismo;

/**
 *
 * @author migue
 */
public class EVA2_21_POLIMORFISMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante estu = new Estudiante("Miguel","caballero",18,"4234525");
        estu.imprimirDatos();
        
        System.out.println("----------------------------------");
     
        Docentes doce = new Docentes();

        doce.setName("Martina");
        doce.setApellido("Chavez");
        doce.setEdad(22);
        doce.setPlaza("Tiempo completo");
        doce.imprimirDatos();
        //PUEDO TRATAR A LOS OBJETOS DE LAS SUBCLASES
        //COMO OPJETOS DE LA SUPERCLASE
        //AL REVES NO SE PUEDE

        //ESTOY ASIGNANDO UN OBJETO DE TIPO ESTUDIANTE
        //A UNA VARIABLE DE TIPO PERSONA
        Persona perso = estu;
        // ESTOY GENERALIZANDO (SIMPLIFICANDO)
        Persona perso2 = doce;
        Persona perso3 = new Persona();
        // Es imposible convertir uan persona en un estudiante
        // no podemos agregar cosas, simplemente ocultamos
        //propiedades
        // Estudiante estu2 = new perso3;

    }
}
