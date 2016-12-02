/**
 *MIT License



Copyright (c) 2016 Patryk Sitko aka.: JigaByte



Permission is hereby granted, free of charge, to any person obtaining a copy

of this software and associated documentation files (the "Software"), to deal

in the Software without restriction, including without limitation the rights

to use, copy, modify, merge, publish, distribute, sublicense, and/or sell

copies of the Software, and to permit persons to whom the Software is

furnished to do so, subject to the following conditions:



The above copyright notice and this permission notice shall be included in all

copies or substantial portions of the Software.



THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR

IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,

FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE

AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER

LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,

OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE

SOFTWARE.
 * */

package my.java.util;

import java.util.Random;

public class UniqueRandoms {
	private static Random randomizer;
	private StringBuilder stringBuilder;
	private static final String STANDARD_MIDDLE = "       ";
	private String customFront, customMiddle, customRear;
	private String result;
	private int counter;
	private static final int MAX_INT = (Math.multiplyExact(2, 31) - 1);
	private long number, standard_Range, user_Range;
	private static long[] drawnNumbers;
	private static final long MAX_LONG = (Math.multiplyExact(2, 63) - 1);
	private static boolean customRange = false, switchOn = false, switchOff = false;

	/**
	 * Standard constructor
	 */

	public UniqueRandoms() {
		this(6);
	}

	/**
	 * constructor 1
	 */

	public UniqueRandoms(int setDraws) {
		this(setDraws, 45);
	}

	/**
	 * constructor 2
	 */

	public UniqueRandoms(int setDraws, int setDrawingRange) {
		this(setDraws, setDrawingRange, null, getStandardMiddle(), null);
	}

	/**
	 * constructor 3
	 */

	public UniqueRandoms(int setDraws, int setStandardDrawingRange, String setCustomFront, String setCustomMiddle,
			String setCustomRear) {
		setDraws(setDraws);
		setStandardDrawingRange(setStandardDrawingRange);
		customFront(setCustomFront);
		customMiddle(setCustomMiddle);
		customRear(setCustomRear);
	}

	/**
	 * draws a number from 1 to max. integer capacity.
	 */

	public static int drawFromNumber1_TO(int maxInt) {
		if (switchOff == true) {
			switchOff = false;
			randomizer = null;
			randomizer = new Random();
			return checkInput(randomizer.nextInt(maxInt) + 1);
		} else
			switchOff = true;
		randomizer = null;
		randomizer = new Random();
		return checkInput(randomizer.nextInt(maxInt) + 1);

	}

	/**
	 * returns the max capacity of an integer.
	 */

	public static int getMAX_INT() {
		return MAX_INT;
	}

	/**
	 * Returns the max capacity of an long integer.
	 */

	public static long getMAX_LONG() {
		return MAX_LONG;
	}

	/**
	 * Gives a number back from the array. from 1 to array.length (0 == 1 && 1
	 * == 1).
	 */

	public long getChoosenNumber(int number) {
		number -= 1;
		if (number < 0)
			number = 0;
		if (number >= getLength())
			number = getLength() - 1;
		return drawnNumbers[number];

	}

	/**
	 * Checks if input is not outOfBound (longer that a Integer allows). Or if
	 * input is not equal or lower than 0. If number == 0 number = 1; else
	 * number -= number;
	 */

	public static int checkInput(int number) {
		if (number <= 0) {
			if (number == 0)
				number = 1;
			else
				number = -number;
		}
		if (number >= UniqueRandoms.MAX_INT) {
			number = UniqueRandoms.MAX_INT;
		}
		return (int) number;
	}

	/**
	 * Checks if input is not outOfBound (longer that a long Integer allows). Or
	 * if input is not equal or lower than 0. If number == 0 number = 1; else
	 * number -= number;
	 */

	public static long checkInput(long number) {
		if (number <= 0) {
			if (number == 0)
				number = 1;
			else
				number -= number;
		}
		if (number >= UniqueRandoms.MAX_LONG) {
			number = UniqueRandoms.MAX_LONG;
		}
		return (long) number;
	}

	/**
	 * Allows you to choose the amount of draws it will perform. (Standard: 6)
	 */

	public void setDraws(int amountOfDraws) {
		drawnNumbers = null;
		drawnNumbers = new long[UniqueRandoms.checkInput(amountOfDraws)];
	}

	/**
	 * Gives the length of the array back.
	 */
	public int getLength() {
		return drawnNumbers.length;
	}

	/**
	 * Allows you to set a custom range of the drawn numbers (Max:
	 * (2^63-1)/long"). (Uses standard range by default (standard range: 45).
	 * Use the "useCustomRange()" method, to let the change take place. Or
	 * change the standard range instead.)
	 */

	public void setCustomDrawingRange(long range) {
		this.user_Range = UniqueRandoms.checkInput(range);
	}

	/**
	 * Allows you to change the standard range of the drawn numbers (Max:
	 * (2^63-1)/long"). If not specified: (standard range: 45)
	 */

	public void setStandardDrawingRange(long range) {
		this.standard_Range = UniqueRandoms.checkInput(range);
	}

	/**
	 * Allows you to switch to the custom range of the drawn numbers ((Max:
	 * (2^63-1)/long")).
	 */

	public void switchToCustomRange(boolean choise) {
		customRange = choise;
	}

	/**
	 * Allows you to switch to the standard range of the drawn numbers (Max:
	 * (2^63-1)/long").(Use this method if you did use the
	 * "switchToCustomRange()" method)
	 */

	public void switchToStandardRange(boolean choise) {
		customRange = choise;
	}

	/**
	 * allows you to modify the front of the toString() method.
	 */

	public void customFront(String customize) {
		customFront = customize;
	}

	/**
	 * allows you to modify the space between the numbers of the toString()
	 * method.
	 */

	public void customMiddle(String customize) {
		customMiddle = customize;
	}

	/**
	 * allows you to modify the rear of the toString() method.
	 */

	public void customRear(String customize) {
		customRear = customize;
	}

	/**
	 * Reset modifications to the toString() method.
	 */

	public void setCustomsToNull(boolean customFront, boolean customMiddle, boolean customRear) {
		if (customFront == true) {
			customFront(null);
		}
		if (customMiddle == true) {
			customMiddle(null);
		}
		if (customRear == true) {
			customRear(null);
		}
	}

	/**
	 * Method to draw unique numbers.
	 */

	public void startDrawing() {
		if (!(drawnNumbers == null)) {
			for (int count = 0; count < getLength(); ++count) {
				while (isPresent() == true)
					draw();
				drawnNumbers[count] = getNumber();

			}
		} else
			return;
	}

	/**
	 * Puts the drawn numbers to a String
	 */

	public String toString() {
		stringBuilder = null;
		stringBuilder = new StringBuilder();
		if (!(getCustomFront() == null)) {
			stringBuilder.append(getCustomFront());
		}
		for (counter = 0; counter < getLength(); counter++) {
			if (counter < getLength() - 1) {
				if (getCustomMiddle() != null)
					stringBuilder.append(drawnNumbers[counter]).append(getCustomMiddle());
				if (getCustomMiddle() == null)
					stringBuilder.append(drawnNumbers[counter]).append(getStandardMiddle());
			} else
				stringBuilder.append(drawnNumbers[counter]);
		}
		if (!(getCustomRear() == null)) {
			stringBuilder.append(getCustomRear());
		}
		result = stringBuilder.toString();
		return result;
	}

	/**
	 * -----------------------------Different private methods:
	 */

	/**
	 * Makes modification to the toString() method.
	 */
	private String getCustomFront() {
		return customFront;
	}

	/**
	 * Makes modification to the toString() method.
	 */

	private String getCustomMiddle() {
		return customMiddle;
	}

	/**
	 * Makes modification to the toString() method.
	 */

	private static String getStandardMiddle() {
		return STANDARD_MIDDLE;
	}

	/**
	 * Makes modification to the toString() method.
	 */

	private String getCustomRear() {
		return customRear;
	}

	/**
	 * Gives the current random number back.
	 */

	private long getNumber() {
		return this.number;
	}

	/**
	 * Draws a number.
	 */

	private void draw() {
		if (switchOn == true) {
			switchOn = false;
			if (customRange == true)
				this.number = (long) (Math.random() * user_Range) + 1;
			else
				this.number = (long) (Math.random() * standard_Range) + 1;
		} else {
			switchOn = true;
			if (customRange == true)
				this.number = (long) (Math.random() * user_Range) + 1;
			else
				this.number = (long) (Math.random() * standard_Range) + 1;
		}
	}

	/**
	 * Checks if drawn number is present.
	 */
	private boolean isPresent() {
		for (int count = 0; count < drawnNumbers.length; count++) {
			if (drawnNumbers[count] == getNumber()) {
				return true;
			}
		}
		return false;
	}
}
