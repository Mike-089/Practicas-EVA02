/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_8_super;

/**
 *
 * @author migue
 */
public class EVA2_8_SUPER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal animal = new Animal("asgag",19);
        System.out.println("----------------------------");
        Mamifero mami = new Mamifero("negro","perro",43);
        System.out.println("----------------------------");
        Canes can = new Canes();
        
    }
    
}

class Animal{
    private String nombre;
    private int peso;
    
    public Animal(){
        System.out.println("Its alive!!");
    }

    public Animal(String nombre, int peso) {
        this.nombre = nombre;
        this.peso = peso;
        System.out.println("Its alive!! constructor 2");
    }
    
    public void respirar(){
        System.out.println("Estoy respirando");
    }
      public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
}
class Mamifero extends Animal{
    private String colorpelo;
    public Mamifero(){
        // super --> apuntador a la superclase
        super(); // llamada al constructor default
        // lo primero a llamar en un constructor es llamar
        // al constructro de la superclase
        System.out.println("Soy un mamifero!!");
    }
    
     public Mamifero(String colorpelo, String nombre, int peso) {
        super(nombre, peso);// llamada al constructor de la superclase
        this.colorpelo = colorpelo;
        
        System.out.println("Soy un mamifero!! constructor 2");
    }
     
    public String getColorpelo() {
        return colorpelo;
    }

    public void setColorpelo(String colorpelo) {
        this.colorpelo = colorpelo;
    }
    
}

class Canes extends Mamifero{
    
    public Canes(){
        super();
        
        System.out.println("soy un can!!");
    }
}