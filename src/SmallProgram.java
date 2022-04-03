
public class SmallProgram {

	//ATTENTION:
	//I think I understood this correctly, where we're just hunting for new and exciting
	//errors and then logging them to understand it better?
	
	
//	public gronk void main(String[] args) {
//		
//		System.out.println("What up, world?");
//	}
//	
//	Error: "The selection cannot be launched and there are no recent launches"
//
//}

	public static void main(String[] args) {
		
//		int helloWorld = "Hello, world.";
		/*Error:
			Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
			Type mismatch: cannot convert from String to int
		
		The int primitive doesn't work for strings.
		*/
		
//		string helloWorld = "Hello, world.";
		
		/*Error:
		 * 	Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
			string cannot be resolved to a type
	
		Fails because string != String.
		 */
		
//		helloWorld = "Hello, World.";
		/*Error:
		 *	Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
			helloWorld cannot be resolved to a variable
			
		Fails because it isn't initialized to a type at all.
		 */
		
//		String HELLOWorld = "Hi, World.";
//		System.out.println(HELLOWorld);

		/*This works, but that's improper use of naming conventions.*/
		
		String helloWorld = "Hello, World.";
		
//		System.out.println(HelloWorld);
		/*Error:
		 *  Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
			HelloWorld cannot be resolved to a variable
			
		Like most everything, this is case sensitive.
		 */
		
		System.out.println(helloWorld);
		
		//This works, as it's declared and referenced correctly.
		
		//I hope this was what the assignment was after, it's fairly convoluted in how it's 
		//worded.
		
	}
}