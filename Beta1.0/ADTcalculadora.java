import java.io.FileNotFoundException;

/**
 * @author Diego Morales, Julio Gonzalez
 *
 * @param <P>
 */
public interface ADTcalculadora<P> {

	/**
	 * Metodo encargado de leer el .text
	 * @param file
	 * @throws FileNotFoundException
	 * @throws Exception
	 */
	public void readFile(String file) throws FileNotFoundException, Exception;
	
	/**
	 * Metodo que se encarga de realizar los calculos
	 * @return resultado
	 * @throws Exception
	 */
	public P calcular() throws Exception;
}
