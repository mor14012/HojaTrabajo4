/**
 * @author Diego Morales, Julio Gonzalez
 *
 * @param <E>
 */
public interface ADTstack<E>{
	/**
	 * Metodo que determina el tamano 
	 * @return in size
	 */
	public int size();
	/**
	 * Metodo que ingresa datos al vector o arraylist
	 * @param value
	 */
	public void push(E value);
	/**
	 * Metodo que regresa datos que estan dentro de vector o arraylist
	 * @return E value
	 */
	public E pop();
}
