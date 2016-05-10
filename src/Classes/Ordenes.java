package Classes;
public class Ordenes {
    Lista materiales;
    
    public Ordenes(){
        
    }
    
    public Ordenes(Lista materiales){
        this.materiales = materiales;
    }
    
    public Lista getMateriales(){
        return  materiales;
    }
    
    public void setMateriales(Lista materiales){
        this.materiales = materiales;
    }
    
    
}
