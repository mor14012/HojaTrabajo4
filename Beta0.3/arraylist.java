import java.util.ArrayList;

public class arraylist<E> extends stack<E>{

	 protected ArrayList<E> lista;

	public void arraylist(){
	lista= new ArrayList<E>();
	} 
	
	
	
	public void push(E value){
		lista.add(value);
	}
	
	public E pop(){
		return lista.remove(size()-1);
	}
	
	public int size(){
		return lista.size();
	}
	
	
	
}
