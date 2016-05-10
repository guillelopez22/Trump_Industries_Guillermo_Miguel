package Classes;
public class Nodo_ordenes {
    Ordenes orden = null;
    Nodo_ordenes next;

    public Nodo_ordenes(Ordenes orden){
        this.orden=orden;
    }
    
    public Nodo_ordenes(){
        
    }
            

    public Ordenes getValue() {
        return orden;
    }

    public void setValue(Ordenes orden) {
        this.orden = orden;
    }

    public Nodo_ordenes getNext() {
        return next;
    }

    public void setNext(Nodo_ordenes next) {
        this.next = next;
    }
}
