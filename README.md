# UniqueRandoms
123
I started learning Java since October 3rd at IntecBrussel. And now I'm discovering. I want to chare something I started working on today (12/02/2016). So I'm sharing :)

My methods: (Feel free to contrib.)


/**
	 * draws a number from 1 to max. integer capacity.
	 */

	public static int drawFromNumber1_TO(int maxInt) 

	/**
	 * returns the max capacity of an integer.
	 */

	public static int getMAX_INT() 

	/**
	 * Returns the max capacity of an long integer.
	 */

	public static long getMAX_LONG() 

	/**
	 * Gives a number back from the array. from 1 to array.length (0 == 1 && 1
	 * == 1).
	 */

	public long getChoosenNumber(int number) 

	/**
	 * Checks if input is not outOfBound (longer that a Integer allows). Or if
	 * input is not equal or lower than 0. If number == 0 number = 1; else
	 * number -= number;
	 */

	public static int checkInput(int number) 

	/**
	 * Checks if input is not outOfBound (longer that a long Integer allows). Or
	 * if input is not equal or lower than 0. If number == 0 number = 1; else
	 * number -= number;
	 */

	public static long checkInput(long number) 

	/**
	 * Allows you to choose the amount of draws it will perform. (Standard: 6)
	 */

	public void setDraws(int amountOfDraws) 
	/**
	 * Gives the length of the array back.
	 */
	public int getLength() 

	/**
	 * Allows you to set a custom range of the drawn numbers (Max:
	 * (2^63-1)/long"). (Uses standard range by default (standard range: 45).
	 * Use the "useCustomRange()" method, to let the change take place. Or
	 * change the standard range instead.)
	 */

	public void setCustomDrawingRange(long range) 

	/**
	 * Allows you to change the standard range of the drawn numbers (Max:(2^63-1)/long").
	 If not specified: (standard range: 45)
	 */

	public void setStandardDrawingRange(long range) 

	/**
	 * Allows you to switch to the custom range of the drawn numbers ((Max:
	 * (2^63-1)/long")).
	 */
   
	public void switchToCustomRange(boolean choise) 

	/**
	 * Allows you to switch to the standard range of the drawn numbers (Max:
	 * (2^63-1)/long").(Use this method if you did use the
	 * "switchToCustomRange()" method)
	 */
   
	public void switchToStandardRange(boolean choise)

	/**
	 * allows you to modify the front of the toString() method.
	 */

	public void customFront(String customize) 
  
	/**
	 * allows you to modify the space between the numbers of the toString()
	 * method.
	 */

	public void customMiddle(String customize)

	/**
  * allows you to modify the rear of the toString() method.
	 */

	public void customRear(String customize) 
  
	/**
	 * Reset modifications to the toString() method.
	 */
   
	public void setCustomsToNull(boolean customFront, boolean customMiddle, boolean customRear)
  
	/**
	 * Method to draw unique numbers.
	 */

	public void startDrawing()

	/**
	 * Puts the drawn numbers to a String
	 */

	public String toString() 
