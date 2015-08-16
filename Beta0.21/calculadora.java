import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class calculadora<P> implements ADTcalculadora<P>{
	private String lineWspace;
	private P value;
	private Double a,b,c;
	private int counter;
	private boolean first;
	private int counter1, counter2;
	private stack<Double> Stack;

	public void setStack(stack Stack){
		this.Stack = Stack;
		System.out.println("size = "+Stack.size());
	}

	public void readFile(String file) throws FileNotFoundException, Exception{
		try (BufferedReader br = new BufferedReader(new FileReader(file))){
		    String line;
		    while ((line = br.readLine()) != null) {
		       lineWspace = line.replaceAll(" ", "");
			   counter1=0;
			   counter2=0;
			   for (int i = 0;i < lineWspace.length(); i++){
					if (lineWspace.charAt(i) == 42){
						counter1=counter1+1;
					}
					else if (lineWspace.charAt(i) == 43){
						counter1=counter1+1;
					}
					else if (lineWspace.charAt(i) == 45){
						counter1=counter1+1;
					}
					else if (lineWspace.charAt(i) == 47){
						counter1=counter1+1;
					}
					else{
						counter2=counter2+1;
					}
			    }
				counter2=counter2-1;
				if (counter1 != counter2){
					throw new Exception("Error: No se ingreso bien los datos SWAG LOL");
				}else{
				System.out.println(lineWspace);
		       System.out.println("Resultado: "+calcular());
			 	}

			}
		}
	}

	public P calcular() throws Exception{
		first = true;

		for (int i = 0;i < lineWspace.length(); i++){
		    if (lineWspace.charAt(0) == 42 || lineWspace.charAt(0) == 43 || lineWspace.charAt(0) == 45 || lineWspace.charAt(0) == 47){

	    	System.out.println(lineWspace.charAt(0));
			throw new Exception("Error: No puede iniciar el documento con un operador.");
			}else{
				if(Character.isDigit(lineWspace.charAt(0)) && Character.isDigit(lineWspace.charAt(1)) ) {
		    if (lineWspace.charAt(i) == 43){
		    	counter = 0;
				try {
					a = Stack.pop();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				try {
					b = Stack.pop();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				c = a+b;
		    	Stack.push(c);

		    	//System.out.println("Encontramos una suma en "+i);
		    } else if (lineWspace.charAt(i) == 42){
		    	counter = 0;
		    	try {
					a = Stack.pop();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				try {
					b = Stack.pop();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				c = a*b;
		    	Stack.push(c);

		    	//System.out.println("Encontramos una multiplicación en "+i);
		    } else if (lineWspace.charAt(i) == 45) {
		    	counter = 0;
		    	try {
					a = Stack.pop();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				try {
					b = Stack.pop();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				c = b-a;
		    	Stack.push(c);

		    	//System.out.println("Encontramos una resta en "+i);
		    } else if (lineWspace.charAt(i) == 47){
		    	try {
					a = Stack.pop();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				try {
					b = Stack.pop();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				if (a!=0){
						c = b/a;
		    	                       Stack.push(c);
					} else{
						throw new Exception("Error: No se puede dividir entre 0");

					}
		    } else {
		    	if(!Character.isLetter(lineWspace.charAt(i)))
		    		Stack.push((double)Character.getNumericValue(lineWspace.charAt(i)));
		    	else{
		    		throw new Exception("Error: Se ha encontrado un caracter no válido. Por favor, revise su fichero.");
		    	}
		    }
			}else {
				System.out.println(lineWspace);
				throw new Exception("Error: No puede iniciar el documento uno de los primeros 2 no es digito.");
	         }
			 }
		  }


		try {
			value = (P) Stack.pop();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;


	}

}
