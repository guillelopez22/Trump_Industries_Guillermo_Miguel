package Classes;
public class Nodo_Materiales {
    Material materiales = null;
    Nodo_Materiales next;

    public Nodo_Materiales(Material materiales){
        this.materiales=materiales;
    }
    
    public Nodo_Materiales(){
        
    }
            

    public Object getValue() {
        return materiales;
    }

    public void setValue(Material materiales) {
        this.materiales = materiales;
    }

    public Nodo_Materiales getNext() {
        return next;
    }

    public void setNext(Nodo_Materiales next) {
        this.next = next;
    }
}
