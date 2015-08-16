public class doblenodo<E> extends nodo<E>{
	protected E value;
	protected doblenodo<E> nextt;
	protected doblenodo<E>  previous;
	

	public void doblenodo(E val,doblenodo<E> siguiente,doblenodo<E> anterior){
		value=val;
		nextt=siguiente;
		if (nextt!= null){
			nextt.previous=this;
			
		}
		previous= anterior;
			if(previous!=null){
				previous.nextt=this;
			}
	}
	public doblenodo(E val){
		this(val,null,null);	
	}
	
	public void setPrevious(doblenodo<E> prev){
		previous = prev;
	}
	public doblenodo<E> getPrevious(){
		return previous;
		}
		
	
}
