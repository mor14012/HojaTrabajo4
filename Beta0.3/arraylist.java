import java.util.ArrayList;

public class arraylist<E> extends stack<E>{
    
    protected ArrayList<E> lista;
	
	 public int size(){
        return lista.size();
    }
    
    public arraylist(){
        lista = new ArrayList<E>();
    }
 
    public void push(E val){
		size++;
        lista.add(val);
    }
    
    public E pop(){
		size--;
        return lista.remove(size()-1);
    	
    }
       
}

