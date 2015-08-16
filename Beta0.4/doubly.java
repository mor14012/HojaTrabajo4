/**
 * @author Julio Gonzalez y Diego Morales
 *
 * @param <E>
 */
public class doubly<E> extends linkedlist<E>{
	
	/**
	 * Atributo que indica el primer nodo de lista como 
	 * referencia
	 */
	protected doblenodo<E> head;
	/**
	 * Atributo de tipo doblenodo que mantiene referencia del ultimo
	 * nodo 
	 */
	protected doblenodo<E> tail;
	
	
	/**
	 * constructor de la clase
	 */
	public void doubly(){
	head=null;
	tail=null;
	}
	
	/* (non-Javadoc)
	 * @see hojatrabajo4.ADTlinkedlist#addFirst(java.lang.Object)
	 */
	public  void addFirst (E value){
		head= new doblenodo<E>(value,head,null);
		size++;
			if (tail ==null){
				tail=head;
			}
	
	}
	
	/* (non-Javadoc)
	 * @see hojatrabajo4.ADTlinkedlist#removeFirst()
	 */
	public E removeFirst(){
		if(size!=0){
			doblenodo<E> temp=head;
			head=head.getNext();
			size--;
		return temp.getValue();
		}else{
			return null;
			}
	}
	
	
}
