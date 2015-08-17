/**
 * @author Julio y Diego 
 *
 * @param <E>
 */
public class circular<E> extends linkedlist<E>{
	nodo<E> tail;

	/**
	 * Consttructor donde se inicializan atributos
	 */
	public circular(){
		tail = null;
	}
	/* (non-Javadoc)
	 * @see hojatrabajo4.ADTlinkedlist#addFirst(java.lang.Object)
	 */
	public void addFirst(E value){
		nodo<E> Nodo = new nodo<E>(value);
		Nodo.setValue(value);
		size++;
		if(tail!=null){
			Nodo.setNext(tail.getNext());
			tail.setNext(Nodo);
		}
		else{
			tail = Nodo;
			tail.setNext(tail);
		}
	}
	/* (non-Javadoc)
	 * @see hojatrabajo4.ADTlinkedlist#removeFirst()
	 */
	public E removeFirst(){
		if(size!=0){
			nodo<E> head = tail.getNext();
			if(head==tail)
				tail = null; 	//Si sólo existe un Nodo, será null
			else
				tail.setNext(head.getNext());	//La cola apuntará al elemento que apunta la cabeza para perder su referencia
			size--;
			return head.getValue();

		}
		else{
			return null;
		}
	}
}
