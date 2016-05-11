package Classes;
public class Cola_Materiales {
    private Nodo_Materiales inicio;
    private Nodo_Materiales termino;

    public Cola_Materiales() {
        inicio = null;
        termino = null;
    }

    public void insertar(Material material) {
        Nodo_Materiales i = new Nodo_Materiales(material);
        i.setNext(null);
        if (inicio == null & termino == null) {
            inicio = i;
            termino = i;
        }
        termino.setNext(i);
        termino = termino.getNext();
    }

    public Object extraer() {
        Object dato = inicio.getValue();
        inicio = inicio.getNext();
        return dato;
    }

    public boolean estaVacia() {
        boolean cola = false;
        if (inicio == null & termino == null) {
            cola = true;
            System.out.println("Las ordenes estan vacia");
        } else {
            System.out.println("Las ordenes no estan vacia");
            cola = false;
        }
        return cola;
    }

    public int contar() {
        int contador = 0;
        Nodo_Materiales c = this.inicio;
        while (c != null) {
            contador++;
            c = c.getNext();
        }
        System.out.println("Numero de datos en la cola: " + contador);
        return contador;
    }

    @Override
    public String toString() {
        Nodo_Materiales c = this.inicio;
        String s = "";
        while (c != null) {
            s = s + c.toString();
            c = c.getNext();
        }
        return s;
    }
}
