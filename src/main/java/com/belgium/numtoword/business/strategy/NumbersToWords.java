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

		        
		        appendTensAndUnits(tensAndUnits);
		        return result.toString();
		      }

		    return result.toString();
		  }
	  private void appendTensAndUnits(final Integer tensAndUnits) {
		    if (tensAndUnits > 0 || result.length() == 0) {
		      appendWithAnd(convertTensAndUnits(tensAndUnits));
		    }
		  }

		  private void append(final String words) {
		    appendWithSeparator(words, " ");
		  }

		  private void appendWithAnd(final String words) {
		    appendWithSeparator(words, " and ");
		  }

		  private void appendWithSeparator(final String words, final String separator) {
		    if (result.length() > 0) {
		      result.append(separator);
		    }
		    result.append(words);
		  }

	  private String convertTensAndUnits(final Integer number) {
		    final Integer tens = number / 10;
		    final Integer units = number - tens * 10;

		    if (number < 20) {
		      return NUMBERS_UP_TO_19[number];
		    } else if (units == 0) {
		      return MULTIPLES_OF_10[tens];
		    } else {
		      return MULTIPLES_OF_10[tens] + "-" + NUMBERS_UP_TO_19[units];
		    }
		  }

}

