import java.util.Vector;


/**
 * @author Diego Morales y Julio Gonzalez
 *
 * @param <E>
 */
/**
 * @author Julio
 *
 * @param <E>
 */
/**
 * @author Julio
 *
 * @param <E>
 */
public class vector<E> extends stack<E>{
	/**
	 * atributo de tipo vector
	 */
	protected Vector<E> vec;
	
	
	 
    
    /**
     * constructor de la clase vector
     */
    public vector(){
        vec = new Vector<E>();
		}
	
	/* (non-Javadoc)
	 * @see hojatrabajo4.stack#size()
	 */
	public int size(){
        return vec.size();
    }
 
    /* (non-Javadoc)
     * @see hojatrabajo4.ADTstack#push(java.lang.Object)
     */
    public void push(E val){
		size++;
        vec.add(val);
    }
    
    /* (non-Javadoc)
     * @see hojatrabajo4.ADTstack#pop()
     */
    public E pop(){
		size--;
        return vec.remove(size()-1);
    	
    }
       
}
