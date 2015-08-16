public class doblenodo<E>{
	
	protected E value;
	protected doblenodo<E> next;
	protected doblenodo<E> previous;
	
	
	
	public doblenodo(E val,doblenodo<E> siguiente,doblenodo<E> anterior) {
		value = val;
		next = siguiente;
		if(next != null){
			next.previous = this;
		}
		previous = anterior;
		if (previous != null){
			previous.next = this;
		}
	}
	
	public doblenodo(E val){
		this(val,null,null);
	}
	
	public doblenodo<E> getNext() {
		 
			return next; 
		}
		
		
		public void setNext(doblenodo<E> nextt) {
	
			next = nextt; 
		}

		
		public E getValue() {
	  
			return value; 
		}
		
		
		public void setValue(E val) {
		 
			value = val; 
		}

		
		public doblenodo<E> getPrevious() {
			
			return null;
		}
		
}
