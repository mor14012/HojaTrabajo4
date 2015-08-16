/**
 * @author Julio Gonzalez, Diego Morales
 *
 * @param <E>
 */
public abstract class stack<E> implements ADTstack<E>{
	/**
	 * Variable int para determinar el tamano
	 */
	int size;

	/**
	 * Constructor iniciando variable size
	 */
	public void stack(){
		size = 0;
	}
	/* (non-Javadoc)
	 * @see hojatrabajo4.ADTstack#size()
	 */
	public int size(){
		return size;
	}

}
