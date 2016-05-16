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
public class Nodo_Orden {
    Orden orden = null;
    Nodo_Orden next;

    public Nodo_Orden(Orden orden){
        this.orden=orden;
    }
    
    public Nodo_Orden(){
        
    }
            

    public Orden getValue() {
        return orden;
    }

    public void setValue(Orden orden) {
        this.orden = orden;
    }

    public Nodo_Orden getNext() {
        return next;
    }

    public void setNext(Nodo_Orden next) {
        this.next = next;
    }
}
