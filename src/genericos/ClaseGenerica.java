
package genericos;


public class ClaseGenerica <T>{//tipo generico
    private T objeto;//no se especifica
    
    public ClaseGenerica(T objeto){
        this. objeto = objeto;
    }
    
    public void obtenerTipo(){
        System.out.println("El tipo T es: "+objeto.getClass().getSimpleName());
    }
    
}
