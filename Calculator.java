/**
 * @author Travis Lo
 * ID#: 458
 * Description: a calculator app that can add,sub, mult and div, with a history function
 * @since 2019-02-25
 * @version 2.0
 * 
 */


package cse360assign2;



public class Calculator {
	
	
	
	//global total value
	private int total;
	
	/**
	 * Constructor for calculator class
	 * @param args unused
	 * @return nothing
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	
	/**
	 * This method returns the grand total
	 * @return an integer total
	 */
	public int getTotal () {
		return 0;
	}
	
	/**
	 * This is a void method that adds an integer
	 * @param value
	 */
	public void add (int value) {
		
		total = total + value;
		
	}
	
	/**
	 * This is a void method that subtracts an integer 
	 * @param value
	 */
	public void subtract (int value) {
		
		total = total - value;
		
	}
	
	/**
	 * This a void method that multiplies an integer
	 * @param value
	 */
	public void multiply (int value) {
		total = total * value;
		
	}
	
	/**
	 * This is a void method that divides an integer
	 * @param value
	 */
	public void divide (int value) {
		
		if (value == 0)
		{
			total = 0;
		}
		total = total / value;
		
	}
	
	
	/**
	 * This is a method that returns all the function called 
	 * @return a String of all method called
	 */
	public String getHistory () {
		return "";
	}
}