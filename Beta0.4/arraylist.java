import java.util.ArrayList;

/**
 * @author Julio Gonzalez y Diego Morales
 *
 * @param <E>
 */
public class arraylist<E> extends stack<E>{
    
    /**
     * Atributo de tipo arraylist
     */
    protected ArrayList<E> lista;
	
	 /* (non-Javadoc)
	 * @see hojatrabajo4.stack#size()
	 */
	public int size(){
        return lista.size();
    }
    
    /**
     * Constructor para la clase arraylist
     */
    public arraylist(){
        lista = new ArrayList<E>();
    }
 
    /* (non-Javadoc)
     * @see hojatrabajo4.ADTstack#push(java.lang.Object)
     */
    public void push(E val){
		size++;
        lista.add(val);
    }
    
    /* (non-Javadoc)
     * @see hojatrabajo4.ADTstack#pop()
     */
    public E pop(){
		size--;
        return lista.remove(size()-1);
    	
    }
       
}
