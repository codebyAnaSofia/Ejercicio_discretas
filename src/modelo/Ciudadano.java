package modelo;

public class Ciudadano {
    private String cedula;     
    private String nombre;
    private String apellido;

    public Ciudadano(String cedula) {
        this.cedula = cedula;
    }

    public Ciudadano(String cedula, String nombre, String apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
  
 @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Ciudadano)) return false;
        Ciudadano otro = (Ciudadano) obj;
        return this.cedula.equals(otro.cedula);
    }

    @Override
    public String toString() {
        return "Ciudadano:cedula " + cedula + ", nombre " + nombre + " " + apellido;
    }
}
