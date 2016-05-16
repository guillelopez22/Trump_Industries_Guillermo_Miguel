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
public class Nodo_Producto {
    Producto producto = null;
    Nodo_Producto next;

    public Nodo_Producto(Producto producto){
        this.producto=producto;
    }
    
    public Nodo_Producto(){
        
    }
            

    public Producto getValue() {
        return producto;
    }

    public void setValue(Producto producto) {
        this.producto = producto;
    }

    public Nodo_Producto getNext() {
        return next;
    }

    public void setNext(Nodo_Producto next) {
        this.next = next;
    }
}
