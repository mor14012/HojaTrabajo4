import java.io.FileNotFoundException;

public interface ADTcalculadora<P> {

	public void readFile(String file) throws FileNotFoundException, Exception;
	public P calcular() throws Exception;
}
