/**
 * @author Diego Morales y Julio Gonzalez
 *
 * @param <E>
 */
public class nodo<E>{
	/**
	 * Atributo de tipo E que tiene el valor 
	 */
	protected E val;
	/**
	 * Atributo de tipo nodo para la siguiente referencia en lista
	 */
	protected nodo<E> nextE;
	
	/**
	 * constructor de la clase
	 * @param value
	 * @param next
	 */
	public nodo(E value, nodo <E> next){
		val= value;
		nextE =next;
		
	}
	/**
	 * Constructor de tipo nodo crea un nodo e ingresa datos dentro de este
	 * @param val
	 */
	public nodo(E val){
		this(val,null);
	}
	
	/**
	 * Indica referencia al siguiente nodo en la lista
	 * @param next
	 */
	public void setNext(nodo<E> next){
		nextE=next;
	}
	/**
	 * Obtiene la siguiente referencia
	 * @return NextE
	 */
	public nodo<E> getNext(){
		return nextE;
	}
	/**
	 * Cambia el valor dentro del nodo
	 * @param value
	 */
	public void setValue(E value){
		val=value;
	}
	/**
	 * Obtiene el valor dentro del nodo 
	 * @return val 
	 */
	public E getValue(){
		return val;
	}
}
