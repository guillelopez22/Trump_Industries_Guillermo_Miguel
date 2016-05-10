package Classes;
public class Ordenes {
    Lista_Materiales materiales;
    
    public Ordenes(){
        
    }
    
    public Ordenes(Lista_Materiales materiales){
        this.materiales = materiales;
    }
    
    public Lista_Materiales getMateriales(){
        return  materiales;
    }
    
    public void setMateriales(Lista_Materiales materiales){
        this.materiales = materiales;
    }
    
    @Override
    public String toString(){
        return materiales;
    }
}
