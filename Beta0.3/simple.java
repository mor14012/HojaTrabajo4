public class simple<E> extends linkedlist<E>{
	protected nodo <E> head;

	public void simple(){
		head = null;
	}
	
	public void addFirst(E value){
	
		head= new nodo<E>(value, head);
		size++;
		
	
		}
		
		
	
		
	public E removeFirst(){ 
		if(size!=0){
			nodo<E> temp= head;
			head=head.getNext();
			size--;
			return temp.getValue();
			}
		else{
			return null;
		}
	
	}
	
	
}
