public class nodo<E>{
	protected E value;
	protected nodo next;
	public nodo(){
		value = null;
		next = null;
	}
	public void setNext(nodo nodo){
		next = nodo;
	}
	public nodo getNext(){
		return next;
	}
	public void setValue(E value){
		this.value = value;
	}
	public E getValue(){
		return value;
	}
}