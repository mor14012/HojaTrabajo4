public class factory{
	public stack getStack(String object){
		if(object.equals("Vector"))
			return new vector();
		if(object.equals("ArrayList"))
			return new arraylist();
		if(object.equals("Simple"))
			return new simple();
		if(object.equals("Doubly"))
			return new doubly();
		if(object.equals("Circular"))
			return new circular();
		return null;
	}
}

