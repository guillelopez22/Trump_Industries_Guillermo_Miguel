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
public class Nodo_PilaMateriales {
    Pila_Materiales pila_materiales = null;
    Nodo_PilaMateriales next;

    public Nodo_PilaMateriales(Pila_Materiales pila_materiales){
        this.pila_materiales=pila_materiales;
    }
    
    public Nodo_PilaMateriales(){
        
    }
            

    public Pila_Materiales getValue() {
        return pila_materiales;
    }

    public void setValue(Pila_Materiales pila_materiales) {
        this.pila_materiales = pila_materiales;
    }

    public Nodo_PilaMateriales getNext() {
        return next;
    }

    public void setNext(Nodo_PilaMateriales next) {
        this.next = next;
    }
}
