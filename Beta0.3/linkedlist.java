public abstract class linkedlist<E> extends stack<E> implements ADTlinkedlist<E>{
	//Variables
	public void linkedlist(){
		//Inicializar de variables
	}
	public void push(E value){
		addFirst(value);
	}
	public E pop(){
		return removeFirst();
	}
}
