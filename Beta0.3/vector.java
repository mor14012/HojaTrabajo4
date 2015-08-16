import java.util.Vector;


public class vector<E> extends stack<E>{
	protected Vector<E> vec;
	
	
	 
    
    public vector(){
        vec = new Vector<E>();
		}
	
	public int size(){
        return vec.size();
    }
 
    public void push(E val){
		size++;
        vec.add(val);
    }
    
    public E pop(){
		size--;
        return vec.remove(size()-1);
    	
    }
       
}
