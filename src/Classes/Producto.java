package Classes;
public class Producto {
    String nombre;
    String descripcion;
    int tiempo_esamblado;
    Lista_Materiales materiales;

    public Producto(String nombre, String descripcion, int tiempo_esamblado, Lista_Materiales materiales) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tiempo_esamblado = tiempo_esamblado;
        this.materiales = materiales;
    }

    public Producto() {
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTiempo_esamblado() {
        return tiempo_esamblado;
    }

    public void setTiempo_esamblado(int tiempo_esamblado) {
        this.tiempo_esamblado = tiempo_esamblado;
    }

    public Lista_Materiales getMateriales() {
        return materiales;
    }

    public void setMateriales(Lista_Materiales materiales) {
        this.materiales = materiales;
    }

    @Override
    public String toString() {
        return nombre;
    }

    

    
}
