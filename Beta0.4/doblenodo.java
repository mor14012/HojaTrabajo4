/**
 * @author Julio Gonzalez y Diego Morales
 *
 * @param <E>
 */
public class doblenodo<E>{
	
	/**
	 * Atributo de tipo E tiene el valor del nodo 
	 */
	protected E value;
	/**
	 * Atributo de tipo doblenodo para la siguiente referencia
	 */
	protected doblenodo<E> next;
	/**
	 * Atributo de tipo doble nodo como referencia del nodo anterior
	 */
	protected doblenodo<E> previous;
	
	
	
	/**
	 * Constructor de la clase doblenodo
	 * @param value
	 * @param siguiente
	 * @param anterior
	 */
	public doblenodo(E value,doblenodo<E> siguiente,doblenodo<E> anterior) {
		//super.(value);
		this.value=value;
		
		next = siguiente;
		if(next != null){
			next.previous = this;
		}
		previous = anterior;
		if (previous != null){
			previous.next = this;
		}
	}
	
	/**
	 * Metodo que crea doblenodos
	 * @param val
	 */
	public doblenodo(E val){
		this(val,null,null);
	}
	
	/**
	 * Metodo que obtiene referencia del siguiente nodo
	 * @return next
	 */
	public doblenodo<E> getNext() {
		 
			return next; 
		}
		
		
		/**
		 * Metodo que setea la referencia del siguiente nodo 
		 * @param nextt
		 */
		public void setNext(doblenodo<E> nextt) {
	
			next = nextt; 
		}

		
		/**
		 * obtiene el valor del nodo 
		 * @return value
		 */
		public E getValue() {
	  
			return value; 
		}
		
		
		/**
		 * Modifica el valor dentro del nodo 
		 * @param val
		 */
		public void setValue(E val) {
		 
			value = val; 
		}

		
		/**
		 * Obtiene la referencia al nodo previo 
		 * @return null
		 */
		public doblenodo<E> getPrevious() {
			
			return null;
		}
		
		/** 
		 * Modifica el valor de la referencia del nodo anterior
		 * @param prevv
		 */
		public void setPrevious(doblenodo<E> prevv){
			previous=prevv;
		}
		
}
