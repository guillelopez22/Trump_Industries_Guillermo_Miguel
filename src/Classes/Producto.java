package Classes;
public class Producto {
    String nombre;
    Lista_Materiales materiales;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Lista_Materiales getMateriales() {
        return materiales;
    }

    public void setMateriales(Lista_Materiales materiales) {
        this.materiales = materiales;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + '}';
    }

    
}
