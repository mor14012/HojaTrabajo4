public class doblenodo<E> extends nodo<E>{
	protected doblenodo<E> previous;

	public void doblenodo(){
		value = null;
		next = null;
		previous = null;
	}
	public void setPrevious(doblenodo Nodo){
		previous = Nodo;
	}
	public nodo getPrevious(){
		return previous;
	}

}