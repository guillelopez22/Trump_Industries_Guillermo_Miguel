package Classes;
public class Nodo {
    Object obj = null;
    Nodo next;

    public Nodo(Object obj){
        this.obj=obj;
    }
    
    public Nodo(){
        
    }
            

    public Object getValue() {
        return obj;
    }

    public void setValue(Object object) {
        this.obj = obj;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
}
