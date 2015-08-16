import java.util.Scanner;
import java.io.FileNotFoundException;

public class main{
	public static void main(String[] args) {
		stack<Double> GeneratedStack;
		factory Factory = new factory();
		calculadora<Double> Calculadora = new calculadora<Double>();

		System.out.println("---------- Stack 1.0 ----------");

		//----------Ingreso de Datos----------
		System.out.println("Bienvenido, por favor seleccione el número del tipo de Stack que desea utilizar");
		while(true){
			System.out.println("1. Vector\n2. ArrayList\n3. Simple List\n4. Doubly List\n5. Circular List\n");
			try{
				Scanner input = new Scanner(System.in);
				int option = input.nextInt();
				if(option==1){
					GeneratedStack = Factory.getStack("Vector");
					break;
				}
				if(option==2){
					GeneratedStack = Factory.getStack("ArrayList");
					break;
				}
				if(option==3){
					GeneratedStack = Factory.getStack("Simple");
					break;
				}
				if(option==4){
					GeneratedStack = Factory.getStack("Doubly");
					break;
				}
				if(option==5){
					GeneratedStack = Factory.getStack("Circular");
					break;
				}
				System.out.println("ERROR 2: Ingrese uno de los números de la lista.\n");
			}
			catch(Exception e){
				System.out.println("ERROR 1: Ingrese un número valido.\n");
			}
		}
		System.out.println("Ingreso correcto.");

		//---------- Calculadora ----------
		try{
			Calculadora.setStack(GeneratedStack);
			Calculadora.readFile("datos.txt");
		}
		catch(FileNotFoundException e){
			System.out.println("Error: Fichero no encontrado");
			System.out.println(e.getMessage());
		}
		catch(Exception e){
			System.out.println("Error de lectura del fichero");
			System.out.println(e.getMessage());
		}
	}
}



/*
size 	-> size 				?
push	-> addFirst
pop		-> removeFirst
*/

