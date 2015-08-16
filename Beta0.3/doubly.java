public class doubly<E> extends linkedlist<E>{
	
	protected doblenodo<E> head;
	protected doblenodo<E> tail;
	
	
	public void doubly(){
	head=null;
	tail=null;
	}
	
	public  void addFirst (E value){
		head= new doblenodo<E>(value,head,null);
		size++;
			if (tail ==null){
				tail=head;
			}
	
	}
	
	public E removeFirst(){
		if(size!=0){
			doblenodo<E> temp=head;
			head=head.getNext();
			size--;
		return temp.getValue();
		}else{
			return null;
			}
	}
	
	
}

