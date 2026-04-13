package gestor;

import estructuras.ListaEnlazada;

public class Gestor<T>{
    private  ListaEnlazada<T> lista;

    public Gestor(){
        lista = new ListaEnlazada<>();

    }
    //agregar elemento
    public void agregar(T dato){
        lista.agregar(dato);
    }
    // obtener por indice
    public T obtener(int index){
        return lista.obtener(index);
    }
    // buscar elemento
    public T buscar (T dato){
        return lista.buscar(dato);
    }
    //buscar elemento y retornarlo
    public T eliminar(T dato){
        return lista.eliminar(dato);

    }
    //size tamano
    public int size(){
        return lista.size();
    }
}

