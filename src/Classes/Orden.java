package Classes;
public class Orden {
    private Lista_Productos productos;
    
    public Orden(){
        
    }
    
    public Orden(Lista_Productos productos){
        this.productos = productos;
    }
    
    public Lista_Productos getProductos(){
        return  productos;
    }
    
    public void setProductos(Lista_Productos productos){
        this.productos = productos;
    }
    
    
}
