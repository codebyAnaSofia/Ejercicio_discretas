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
        tamano ++;
    }
    //2 Obtener por indice
    public T obtener(int index){
        if(index < 0 || index >= tamano){
            return null;
        }
        Nodo<T> actual = cabeza;
        int contador = 0;
        while(contador < index){
            actual = actual.getSiguiente();
            contador ++;
        }
        return actual.getDato();

    }
    // buscar por dato
    public T buscar(T dato){
        Nodo<T> actual = cabeza;

        while (actual != null){
            if (actual.getDato().equals(dato)){
                return actual.getDato();
            }
            actual = actual.getSiguiente();
        }
        return null;// no encontrado
    }
    public void mostrar() {
        Nodo<T> actual = cabeza;
        while (actual != null) {
            System.out.println(actual.getDato());
            actual = actual.getSiguiente();
        }
    }
    //  eliminar y retonar elemento
    public T eliminar(T dato){
        if (cabeza == null){
            return null;

        }
        // eliminar el primero
        if (cabeza.getDato().equals(dato)){
            T eliminado = cabeza.getDato();
            cabeza = cabeza.getSiguiente();
            tamano--;
            return eliminado;
        }
        Nodo<T> actual = cabeza;
        while (actual.getSiguiente() != null ){
            if (actual.getSiguiente().getDato().equals(dato)){
                T eliminado = actual.getSiguiente().getDato();
                actual.setSiguiente(actual.getSiguiente().getSiguiente());
                tamano--;
                return eliminado;
            }
            actual = actual.getSiguiente();
        }
        return null;// no encontrado
    }
    // tamano de la lista
    public int size(){
        return tamano;
    }
}
