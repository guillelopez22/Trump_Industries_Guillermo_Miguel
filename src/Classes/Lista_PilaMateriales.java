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
public class Lista_PilaMateriales {
  Nodo_PilaMateriales head;
    int size = 0;

    public Lista_PilaMateriales() {
        head = new Nodo_PilaMateriales();
    }

    public void insert(Pila_Materiales pila_materiales, int pos) {
        Nodo_PilaMateriales newNodo = new Nodo_PilaMateriales(pila_materiales);
        Nodo_PilaMateriales newHead = head;
        int cont = 0;
        if (pos == 0) {
            newNodo.setNext(head);
            this.setHead(newNodo);
        }
        while (newHead.getNext() != null) {
            newHead = newHead.getNext();
            cont++;
            if (cont == pos) {
                break;
            }
        }
        Nodo_PilaMateriales n = newHead.getNext();
        newHead.setNext(newNodo);
        newNodo.setNext(n);
    }

    public void setHead(Nodo_PilaMateriales head) {
        this.head = head;
    }

    public int find(int num) {
        return 0;
    }

    public Pila_Materiales get(int pos) {
        Nodo_PilaMateriales temp = head;
        Pila_Materiales valor = temp.getValue();
        for (int i = 0; i < pos; i++) {
            temp = temp.getNext();
            valor = temp.getValue();
        }
        return valor;
    }

    public void delete(int pos) {
        Nodo_PilaMateriales temp = head;
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.getNext();
        }
        Nodo_PilaMateriales temp2 = temp.getNext();
        temp.setNext(temp2.getNext());
    }

    public Object first() {
        return head.getValue();
    }

    public void Print_Lista() {
        Nodo_PilaMateriales temp = head;
        int cont = 0;
        while (temp != null) {
            if (cont == 0) {
                System.out.print("[H]");
            }
            if (temp.getNext() != null) {
                System.out.print("[" + temp.getValue() + "] - ");
                cont++;
            } else {
                System.out.print("[" + temp.getValue() + "]");
                cont++;
            }
            temp = temp.next;
        }
        System.out.println("");
    }

    public void setSize(int cont) {
         size = cont;
    }
    public int size(){
        return size; 
    }  
}
