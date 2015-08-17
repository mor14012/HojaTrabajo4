/**
 * @author Julio Gonzalez y Diego Morales
 *
 * @param <E>
 */
public class simple<E> extends linkedlist<E>{
	/**
	 *Atributo de tipo nodo de clase nodo  
	 */
	protected nodo <E> head;

	/**
	 * Constructor de la clase nodo 
	 */
	public simple(){
		head = null;
	}
	
	/* (non-Javadoc)
	 * @see hojatrabajo4.ADTlinkedlist#addFirst(java.lang.Object)
	 */
	public void addFirst(E value){
	
		head= new nodo<E>(value, head);
		size++;
		
	
		}
		
		
	
		
	/* (non-Javadoc)
	 * @see hojatrabajo4.ADTlinkedlist#removeFirst()
	 */
	public E removeFirst(){ 
		if(size!=0){
			nodo<E> temp= head;
			head=head.getNext();
			size--;
			return temp.getValue();
			}
		else{
			return null;
		}
	
	}
	
	
}
