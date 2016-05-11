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
public class Lista_Productos {
    Nodo_Producto head;

    public Lista_Productos() {
        head = new Nodo_Producto();
    }

    public void insert(Producto producto, int pos) {
        Nodo_Producto newNodo = new Nodo_Producto(producto);
        Nodo_Producto newHead = head;
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
        Nodo_Producto n = newHead.getNext();
        newHead.setNext(newNodo);
        newNodo.setNext(n);
    }

    public void setHead(Nodo_Producto head) {
        this.head = head;
    }

    public int find(int num) {
        return 0;
    }

    public Object get(int pos) {
        Nodo_Producto temp = head;
        Object valor = temp.getValue();
        for (int i = 0; i < pos; i++) {
            temp = temp.getNext();

            valor = temp.getValue();

        }
        return valor;
    }

    public void delete(int pos) {
        Nodo_Producto temp = head;
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.getNext();
        }
        Nodo_Producto temp2 = temp.getNext();
        temp.setNext(temp2.getNext());
    }

    public Object first() {
        return head.getValue();
    }

    public void Print_Lista() {
        Nodo_Producto temp = head;
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