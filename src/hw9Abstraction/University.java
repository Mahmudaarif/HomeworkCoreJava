package hw9Abstraction;

public interface University extends College,Hospital{
	
	//Interface don't have constructor
	/*
	 * public University(){
	 * 
	 * }
	 */
	
	/*
	 * only one keyword(extends)is used for inheritance in interface
	 * interface can inherit interface only
	 * interface cannot inherit regular class or abstract class
	 * more than one inheritance possible in interface
	 */
	
	public void  classSize ();
	
	public abstract void playGround();
	
	public abstract void teacher();
	
	
	public default void  gymnasium(){
		
	}
	
	public static void library() {
		
	}

}
