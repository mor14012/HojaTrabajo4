public class doblenodo<E> extends nodo<E>{
	protected nodo previous;
	protected nodo siguiente;

	public void doblenodo(){
		value = null;
		next = null;
		previous = null;
	}
	public void setPrevious(nodo nodo){
		previous = nodo;
	}
	public nodo getPrevious(){
		return previous;
	}

}
