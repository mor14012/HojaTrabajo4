public class doblenodo<E> {
	protected E value;
	protected doblenodo<E> nextE;
	protected doblenodo<E> previous;
	

	public void doblenodo(E val,doblenodo<E> siguiente,doblenodo<E> anterior){
		value=val;
		nextE=siguiente;
		if (nextE!= null){
			nextE.previous=this;
			
		}
		previous= anterior;
			if(previous!=null){
				previous.nextE=this;
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
		
	public void setNext(doblenodo<E> next1){
		nextE=next1;
	}
	public doblenodo<E> getNext(){
		return nextE;
	}
	public void setValue(E val){
		value=val;
	}
	public E getValue(){
		return value;
	}

}
