package Classes;
public class Orden {
    private Cola_Productos productos;
    
    public Orden(){
        
    }
    
    public Orden(Cola_Productos productos){
        this.productos = productos;
    }
    
    public Cola_Productos getProductos(){
        return  productos;
    }
    
    public void setProductos(Cola_Productos productos){
        this.productos = productos;
    }
    
    
}
