/**
 * Clase factory decide de que tipo es el objeto que se crea
 * @author Julio
 * @param <E>
 *
 */
public class factory<E>{
	/**
	 * Metodo que establece que tipo de stack se crea segun la opcion 
	 * @param object
	 * @return null
	 * @return circular
	 * @return doubly
	 * @return simple
	 * @return Arraylist
	 * @return vector
	 */
	public stack<E> getStack(String object){
		if(object.equals("Vector"))
			return new vector<E>();
		if(object.equals("ArrayList"))
			return new arraylist<E>();
		if(object.equals("Simple"))
			return new simple<E>();
		if(object.equals("Doubly"))
			return new doubly<E>();
		if(object.equals("Circular"))
			return new circular<E>();
		return null;
	}
}
