package algorithms;


/**
 * This class contains a sample implementation of the Generics in Java
 * @author viperias
 *
 */
public class GenericClass<Type> {

	
	// Declaration of object type Type
	private Type type = null;
	
	// Constrctor to set the generic type instance variable
	public GenericClass(Type type){
		this.type = type;
	}
	
	/**
	 * This method returns the 
	 * @return
	 */
	public Type getType(){
		return this.type;
	}
	
	public void printType(){
		
		System.out.println("The given type is: "+getType().getClass().getName()+":  Aishoo Vijay");
	}
	
	public static void main(String[] args) {
		
		GenericClass<Integer> aishoo = new GenericClass<Integer>(1);
		
		aishoo.printType();
		
	}
	
	
}
