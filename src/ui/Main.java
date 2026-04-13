package ui;

import gestor.Gestor;
import modelo.Ciudadano;
import modelo.Estudiante;
import modelo.Producto;

public class Main {

    public static void main(String[] args) {

        // ====== GESTORES ======
        Gestor<Ciudadano> gestorCiudadanos = new Gestor<>();
        Gestor<Estudiante> gestorEstudiantes = new Gestor<>();
        Gestor<Producto> gestorProductos = new Gestor<>();

        // ====== CIUDADANOS ======
        System.out.println("=== CIUDADANOS ===");

        gestorCiudadanos.agregar(new Ciudadano("123", "Juan", "Perez"));
        gestorCiudadanos.agregar(new Ciudadano("456", "Ana", "Gomez"));

        System.out.println("Buscar: " +
                gestorCiudadanos.buscar(new Ciudadano("123")));

        System.out.println("Obtener índice 1: " +
                gestorCiudadanos.obtener(1));

        System.out.println("Eliminar: " +
                gestorCiudadanos.eliminar(new Ciudadano("123")));

        System.out.println("Tamaño: " + gestorCiudadanos.size());


        // ====== ESTUDIANTES ======
        System.out.println("\n=== ESTUDIANTES ===");

        gestorEstudiantes.agregar(new Estudiante(1, "Carlos", "Lopez", "Sistemas"));
        gestorEstudiantes.agregar(new Estudiante(2, "Laura", "Martinez", "Derecho"));

        System.out.println("Buscar: " +
                gestorEstudiantes.buscar(new Estudiante(1)));

        System.out.println("Obtener índice 0: " +
                gestorEstudiantes.obtener(0));

        System.out.println("Eliminar: " +
                gestorEstudiantes.eliminar(new Estudiante(2)));

        System.out.println("Tamaño: " + gestorEstudiantes.size());


        // ====== PRODUCTOS ======
        System.out.println("\n=== PRODUCTOS ===");

        gestorProductos.agregar(new Producto("P01", "Mouse", 50.0));
        gestorProductos.agregar(new Producto("P02", "Teclado", 80.0));

        System.out.println("Buscar: " +
                gestorProductos.buscar(new Producto("P01")));

        System.out.println("Obtener índice 1: " +
                gestorProductos.obtener(1));

        System.out.println("Eliminar: " +
                gestorProductos.eliminar(new Producto("P02")));

        System.out.println("Tamaño: " + gestorProductos.size());
        System.out.println("\nLista ciudadanos:");
        gestorCiudadanos.mostrar();

        System.out.println("\nLista estudiantes:");
        gestorEstudiantes.mostrar();

        System.out.println("\nLista productos:");
        gestorProductos.mostrar();
    }
}