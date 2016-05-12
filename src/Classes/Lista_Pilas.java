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
public class Lista_Pilas {

    Nodo_Pila head;

    public Lista_Pilas() {
        head = new Nodo_Pila();
    }

    public void insert(Pila_Materiales pila, int pos) {
        Nodo_Pila newNodo = new Nodo_Pila(pila);
        Nodo_Pila newHead = head;
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
        Nodo_Pila n = newHead.getNext();
        newHead.setNext(newNodo);
        newNodo.setNext(n);
    }

    public void setHead(Nodo_Pila head) {
        this.head = head;
    }

    public boolean find(String name) {
        boolean buscado = false;
        Nodo_Pila iterador = head;
        while (buscado == false && iterador != null) {
            if (iterador.getValue().tos().getNombre().equals(name) ) {
                buscado = true;
            }
            iterador = iterador.getNext();
        }
        return buscado;
    }

    public Pila_Materiales get(int pos) {
        Nodo_Pila temp = head;
        Pila_Materiales valor = temp.getValue();
        for (int i = 0; i < pos; i++) {
            temp = temp.getNext();
            valor = temp.getValue();
        }
        return valor;
    }

    public void delete(int pos) {
        Nodo_Pila temp = head;
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.getNext();
        }
        Nodo_Pila temp2 = temp.getNext();
        temp.setNext(temp2.getNext());
    }

    public Object first() {
        return head.getValue();
    }

    public void Print_Lista() {
        Nodo_Pila temp = head;
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

    public int getSize() {
        int cont = 0;
        while (head.getNext() != null) {
            cont++;
        }
        return cont;
    }

}
