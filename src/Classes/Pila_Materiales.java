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
public class Pila_Materiales {
    Nodo_Materiales tos;
    Nodo_Materiales head;
    int size = 0;

    public void push(Material materiales) {
        Nodo_Materiales newNodo = new Nodo_Materiales();
        if (tos == null) {
            tos = newNodo;
        } else {
            newNodo.next = tos;
            tos = newNodo;
        }
        size++;
    }

    public Material pop() {
        Material materiales;
        if (tos == null) {
            return null;
        }
        materiales = tos.getValue();
        tos = tos.next;
        size--;
        return materiales;
    }

    public Material tos() {
        if (tos == null) {
            return null;
        } else {
            return tos.getValue();
        }
    }
    
    public int getsize(){
        return size;
    }
    
    public boolean empty(){
        if(head==null){
            return true; 
        }else{
            return false;
        }
    }
}
