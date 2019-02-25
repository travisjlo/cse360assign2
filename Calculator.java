/**
 * @author Travis Lo
 * ID#: 458
 * Description: a calculator app that can add,sub, mult and div, with a history function
 * @since 2019-02-25
 * @version 3.0
 * 
 */
package cse360assign2;

public class Calculator {
	
	//global total value
	private int total;
	private String history = "0 ";
	
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
		return total;
	}
	
	/**
	 * This is a void method that adds an integer
	 * updates the history value
	 * @param value
	 */
	public void add (int value) {
		total = total + value;
		
		history = history + "+ " + value + " ";
	}
	
	/**
	 * This is a void method that subtracts an integer 
	 * updates the history value
	 * @param value
	 */
	public void subtract (int value) {
		total = total - value;
		
		history = history + "- " + value + " ";
	}
	
	/**
	 * This a void method that multiplies an integer
	 * updates the history value
	 * @param value
	 */
	public void multiply (int value) {
		total = total * value;
		
		history = history + "* " + value + " ";
	}
	
	/**
	 * This is a void method that divides an integer
	 * if zero returns zero
	 * updates the history value
	 * @param value
	 */
	public void divide (int value) {
		if (value == 0)
		{
			total = 0;
		}
		else {
		total = total / value;
		}
		history = history + "/ " + value + " ";
	}
	
	/**
	 * This is a method that returns all the function called 
	 * @return a String of all method called
	 */
	public String getHistory () {
		return history;
	}
}