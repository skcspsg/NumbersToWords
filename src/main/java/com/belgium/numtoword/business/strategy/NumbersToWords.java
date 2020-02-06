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

}

