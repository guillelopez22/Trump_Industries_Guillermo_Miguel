package Classes;
public class Nodo_Materiales {
    Material materiales;
    Nodo_Materiales next;

    public Nodo_Materiales(Material materiales){
        this.materiales=materiales;
    }
    
    public Nodo_Materiales(){
        
    }
            

    public Material getValue() {
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
