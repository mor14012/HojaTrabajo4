public class nodo<E>{
	protected E val;
	protected nodo<E> nextE;
	
	public nodo(E value, nodo <E> next){
		val= value;
		nextE =next;
		
	}
	public nodo(E val){
		this(val,null);
	}
	
	public void setNext(nodo<E> next){
		nextE=next;
	}
	public nodo getNext(){
		return nextE;
	}
	public void setValue(E value){
		val=value;
	}
	public E getValue(){
		return val;
	}
}
