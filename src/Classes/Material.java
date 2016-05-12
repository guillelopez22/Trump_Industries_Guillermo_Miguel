package Classes;
public class Material {
    public String nombre;
    public String descripcion;
    public String marca;
    public String serial_number;

    public Material(String nombre, String descripcion, String marca, String serial_number) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.marca = marca;
        this.serial_number = serial_number;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(String serial_number) {
        this.serial_number = serial_number;
    }

    @Override
    public String toString() {
        return nombre + " "+ serial_number;
    }
    
    
}
