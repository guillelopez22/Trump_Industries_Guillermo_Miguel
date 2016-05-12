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
public class Nodo_Empleado {
    Empleado empleado = null;
    Nodo_Empleado next;

    public Nodo_Empleado(Empleado empleado){
        this.empleado=empleado;
    }
    
    public Nodo_Empleado(){
        
    }
            

    public Empleado getValue() {
        return empleado;
    }

    public void setValue(Empleado empleado) {
        this.empleado = empleado;
    }

    public Nodo_Empleado getNext() {
        return next;
    }

    public void setNext(Nodo_Empleado next) {
        this.next = next;
    }
}