package Classes;
public class Empleado {
    private String nombre;
    private String identidad;
    private int edad;
    private String direccion;
    private double salario;

    public Empleado(String nombre, String identidad, int edad, String direccion, double salario) {
        this.nombre = nombre;
        this.identidad = identidad;
        this.edad = edad;
        this.direccion = direccion;
        this.salario = salario;
    }

    public Empleado() {
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
