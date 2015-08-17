/**
 * 
 * @author Julio Gonzalez y Diego Morales
 *
 * @param <E>
 */
public abstract class linkedlist<E> extends stack<E> implements ADTlinkedlist<E>{
	
	/**
	 * Se establece el constructor
	 */
	public linkedlist(){
		
	}
	/* (non-Javadoc)
	 * @see hojatrabajo4.ADTstack#push(java.lang.Object)
	 */
	public void push(E value){
		addFirst(value);
	}
	/* (non-Javadoc)
	 * @see hojatrabajo4.ADTstack#pop()
	 */
	public E pop(){
		return removeFirst();
	}
}
