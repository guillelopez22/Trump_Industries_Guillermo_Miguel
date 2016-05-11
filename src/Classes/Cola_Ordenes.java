/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Memo
 */
public class Cola_Ordenes {
    private Nodo_Orden inicio;
    private Nodo_Orden termino;

    public Cola_Ordenes() {
        inicio = null;
        termino = null;
    }

    public void insertar(Orden orden) {
        Nodo_Orden i = new Nodo_Orden(orden);
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
        Nodo_Orden c = this.inicio;
        while (c != null) {
            contador++;
            c = c.getNext();
        }
        System.out.println("Numero de datos en la cola: " + contador);
        return contador;
    }

    @Override
    public String toString() {
        Nodo_Orden c = this.inicio;
        String s = "";
        while (c != null) {
            s = s + c.toString();
            c = c.getNext();
        }
        return s;
    }
}
