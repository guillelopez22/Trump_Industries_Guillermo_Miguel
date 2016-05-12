/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Miguel A. Ardon E
 */
public class Nodo_Pila {

    private Pila_Materiales pila = null;
    Nodo_Pila next;

    public Nodo_Pila(Pila_Materiales pila) {
        this.pila = pila;
    }

    public Nodo_Pila() {

    }

    public Pila_Materiales getValue() {
        return pila;
    }

    public void setValue(Pila_Materiales pila) {
        this.pila = pila;
    }

    public Nodo_Pila getNext() {
        return next;
    }

    public void setNext(Nodo_Pila next) {
        this.next = next;
    }
}
