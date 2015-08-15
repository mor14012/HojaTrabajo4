public class doblenodo<E> extends nodo<E>{
	protected nodo previous;

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