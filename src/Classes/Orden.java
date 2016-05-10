package Classes;
public class Orden {
    Lista_Materiales materiales;
    
    public Orden(){
        
    }
    
    public Orden(Lista_Materiales materiales){
        this.materiales = materiales;
    }
    
    public Lista_Materiales getMateriales(){
        return  materiales;
    }
    
    public void setMateriales(Lista_Materiales materiales){
        this.materiales = materiales;
    }
    
    
}
