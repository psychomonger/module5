/***********************************************************************
 * George E. Mitchell
 * 202330 Software Development I CEN-3024C-32552
 * Module 5 | Documentation Assignment
***********************************************************************/
package package1;


/**
 * Handles the processes related to the Fibonacci sequence.
 * 
 * @author George E. Mitchell
 * @version 1.0
 * @since 1.0
 */
public class Fibonacci {
	
	/**
	 * Calculates the Fibonacci sequence recursively starting at one
	 * to the final number provided.
	 * 
	 * @param n - Final number to use in calculation.
	 * @return Integer results of Fibonacci sequence.
	 */
	public int calc_recursive(int n) {
        
		int output;
		if (n <= 1) output = n;
		else output = calc_recursive(n - 1) + calc_recursive(n - 2);
		return output;
    
	}
	
	/**
	 * Calculates the Fibonacci sequence iteratively starting at one
	 * to the final number provided.
	 * 
	 * @param n - Final number to use in calculation.
	 * @return Integer results of Fibonacci sequence.
	 */
	public int calc_iterative(int n) {
		
		int a = 0, b = 1, c = 0, output = 0;
		if (n == 0) output = a;
		else for (int i = 2; i <= n; i++) {
	        c = a + b;
	        a = b;
	        b = c;
	    } 
		output = b;
	    return output;
    
	}
	
}
