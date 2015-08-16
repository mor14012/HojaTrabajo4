/**
 * Clase factory decide de que tipo es el objeto que se crea
 * @author Julio
 *
 */
public class factory{
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
	public stack getStack(String object){
		if(object.equals("Vector"))
			return new vector();
		if(object.equals("ArrayList"))
			return new arraylist();
		if(object.equals("Simple"))
			return new simple();
		if(object.equals("Doubly"))
			return new doubly();
		if(object.equals("Circular"))
			return new circular();
		return null;
	}
}
