/**
 * 
 */
package com.belgium.numtoword.business.strategy;

import com.belgium.numtoword.business.exception.BusinessException;

/**
 * @author PC
 *
 */

public class NumbersToWords {
	private static final String[] NUMBERS_UP_TO_19 = { "zero", "one", "two",
	      "three", "four", "five", "six", "seven", "eight", "nine", "ten",
	      "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
	      "seventeen", "eighteen", "nineteen" };
	  private static final String[] MULTIPLES_OF_10 = { "", "", "twenty", "thirty",
	      "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };
	  
	  private final Integer number;
	  private StringBuffer result = new StringBuffer();

	  public static String convert(final Integer number) throws BusinessException {
	    return new NumbersToWords(number).convert();
	  }

	  public NumbersToWords(final Integer number) {
	    this.number = number;
	  }
	  public String convert() throws BusinessException {
		    if (number > 999999) {
		      throw new BusinessException("Limit is 6 digit exit");
		    }

		    final Integer millions = number / 1000000;
		    Integer remainder = number % 1000000;
		    final Integer thousands = remainder / 1000;
		    remainder = remainder % 1000;
		    final Integer hundreds = remainder / 100;
		    final Integer tensAndUnits = remainder % 100;

		   
		    return result.toString();
		  }

}

