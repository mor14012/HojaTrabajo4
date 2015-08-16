public abstract class stack<E> implements ADTstack<E>{
	int size;
	protected E value;
	protected int index;

	public void stack(){
		index = 0;
		value = null;
		size = 0;
	}
	public int size(){
		return size;
	}
	
	public void push(E value){
		//add(0,value);
		push(value);

	}
	public E pop(){
		//return remove();
		return pop();
	}
	
	

}
