public class simple<E> extends linkedlist<E>{
	protected nodo<E> head;

	public void simple(){
		head = null;
	}
	public void addFirst(E value){ 
		nodo<E> Nodo = new nodo<E>();
		Nodo.setValue(value);
		Nodo.setNext(head);
		head = Nodo;
		size++;
	}
	public E removeFirst(){ 
		if(size!=0){
			nodo<E> temp = head;
			head = head.getNext();
			size--;
			return temp.getValue();
		}
		else
			return null;
	}
}