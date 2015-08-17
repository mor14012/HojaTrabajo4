/**
 * @author Diego Morales, Julio Gonzalez
 *
 * @param <E>
 */
public interface ADTlinkedlist<E>{
	/**
	 * metodo que permite agregar a primera posicion el dato de tipo E
	 * @param value
	 */
	public void addFirst(E value);
	/**
	 * @return E value
	 */
	public E removeFirst();
}
