/***********************************************************************
 * George E. Mitchell
 * 202330 Software Development I CEN-3024C-32552
 * Module 5 | Documentation Assignment
***********************************************************************/
package package1;

/**
 * Outputs the runtimes for a Fibonacci sequence calculated recursively and 
 * iteratively to the console. 
 * 
 * This application calculates the value of the Fibonacci sequence from a 
 * starting number to an ending number both using the Fibonacci object
 * functions calc_recursive and calc_iterative. The runtime is also 
 * calculated for each function with all of the results output to the console.
 * 
 * @author George E. Mitchell
 * @version 1.0
 * @see https://www.oracle.com/technical-resources/articles/java/javadoc-tool.html#:~:text=A%20doc%20comment%20is%20written,%40return%20%2C%20and%20%40see%20.
 * @since 1.0
 */
public class Application {

	/**
	 * This is the main function of the application.
	 * 
	 * @param args
	 * @since 1.0
	 */
	public static void main(String[] args) {
		
		// Declare and initialize objects and variables.
		Fibonacci fibonacci = new Fibonacci();
		int startNum = 1;		// Start number
		int finalNum = 30;		// End number
		int rsRecursive = 0;	// Results from recursive function.
		int rsIterative = 0;	// Results from iterative function.
		long stRecursive = 0;	// Start time of recursive function.
		long etRecursive = 0;	// End time of recursive function.
		long rtRecursive = 0;	// Runtime of recursive function.
		long stIterative= 0;	// Start time of iterative function.
		long etIterative = 0;	// End time of iterative function.
		long rtIterative = 0;	// Runtime of iterative function.
		
		// Output output column headers to console.
		System.out.printf("%-10.10s %-10.10s %-10.10s  %-10.10s%n", "nth Term", "Results", "R-Runtime", "I-Runtime");
		
		// Iterate from start number to end number.
		for(int n = startNum; n <= finalNum; n++) {
		
			// Calculate Fibonacci value recursively.
			stRecursive = System.nanoTime();
			rsRecursive = fibonacci.calc_recursive(n);
			etRecursive = System.nanoTime();
			rtRecursive = etRecursive - stRecursive;
		
			// Calculate Fibonacci value iteratively.
			stIterative = System.nanoTime();
			rsIterative = fibonacci.calc_iterative(n);
			etIterative = System.nanoTime();
			rtIterative = etIterative - stIterative;
		
			// Output results to console.
			//System.out.println(n + " \t " + rsRecursive + " \t " + rtRecursive + " \t " + rtIterative);
			System.out.printf("%-10.10s %-10.10s %-10.10s  %-10.10s%n", n, rsRecursive, rtRecursive, rtIterative);
		
		}
	     
	}

}
