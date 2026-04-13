package estructuras;

public class ListaEnlazada<T>{
    private Nodo<T> cabeza;
    private int tamano;

    public ListaEnlazada(){
        cabeza = null;
        tamano = 0;
    }
    public void agregar (T dato){
        Nodo<T> nuevo = new Nodo<>(dato);

        if (cabeza == null){
            cabeza = nuevo;

        } else {
            Nodo<T> actual = cabeza;
            while(actual.getSiguiente() != null){
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
    }
}
