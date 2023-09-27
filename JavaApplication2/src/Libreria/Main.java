package Libreria;

import Libreria.Entidades.Libro;
import Libreria.Entidades.Persona;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
       
        List<Libro> libro = new ArrayList<>();//titulo, isbn, autor, numPaginas
        Persona persona1 = new Persona("Jose", 159951159, "Venecia");
        Libro libro1 = new Libro("El Principito", "9789876848039", "Saint-Exúpery", 1);
        Libro libro2 = new Libro("El Principito", "9789876848039", "Saint-Exúpery", 12);
        Libro libro3 = new Libro("El Principito", "9789876848039", "Saint-Exúpery", 123);
        Libro libro4 = new Libro("El Principito", "9789876848039", "Saint-Exúpery", 1234);
        
        libro.add(libro1);
        libro.add(libro2);
        libro.add(libro3);
        libro.add(libro4);
        
        for (Libro l : libro) {
            System.out.println(l);
        }
        
        System.out.println(persona1.toString());
        
    }
    
}
