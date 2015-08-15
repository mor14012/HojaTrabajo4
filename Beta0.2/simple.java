public class simple<E> extends linkedlist<E>{
	nodo<E> head;

	public void simple(){
		head = null;
	}
	public void addFirst(E value){ //Esto funciona si es el primer elemento ingresado, y si ignresa otro? pierde la referencia
		head= new nodo<E>();
		head.setValue(value);
		size++;
	}
	public E removeFirst(){ //Y si no hay nada?
		nodo<E> temp=head;
		head.setNext(head.getNext());
		size--;
		return temp.getValue();
	}
}