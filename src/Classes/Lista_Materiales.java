package Classes;

public class Lista_Materiales {

    Nodo_Materiales head;
    int size = 0;

    public Lista_Materiales() {
        head = new Nodo_Materiales();
    }

    public void insert(Material materiales, int pos) {
        Nodo_Materiales newNodo = new Nodo_Materiales(materiales);
        Nodo_Materiales newHead = head;
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
        Nodo_Materiales n = newHead.getNext();
        newHead.setNext(newNodo);
        newNodo.setNext(n);
    }

    public void setHead(Nodo_Materiales head) {
        this.head = head;
    }

    public boolean find(String name) {
        boolean buscado = false;
        Nodo_Materiales iterador = head;
        while (buscado == false && iterador != null) {
            if (iterador.getValue().getNombre().equals(name)) {
                buscado = true;
            }
            iterador = iterador.getNext();
        }
        return buscado;
    }

    public Material get(int pos) {
        Nodo_Materiales temp = head;
        Material valor = temp.getValue();
        for (int i = 0; i < pos; i++) {
            temp = temp.getNext(); 
            valor = temp.getValue();
        }
        return valor;
    }

    public void delete(int pos) {
        Nodo_Materiales temp = head;
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.getNext();
        }
        Nodo_Materiales temp2 = temp.getNext();
        temp.setNext(temp2.getNext());
    }

    public Material first() {
        return head.getValue();
    }

    public void Print_Lista() {
        Nodo_Materiales temp = head;
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

    public int size() {
        return size;
    }

}
