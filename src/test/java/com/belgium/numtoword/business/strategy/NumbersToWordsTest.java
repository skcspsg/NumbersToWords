/**
 * 
 */
package com.belgium.numtoword.business.strategy;

/**
 * @author PC
 *
 */

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.belgium.numtoword.business.exception.BusinessException;
@SpringBootTest
public class NumbersToWordsTest {

	@Test
	  public void convertsZero() {
	    expectConversion(0, "zero");
	  }
	@Test
	  public void convertsSingleDigits() {
	    expectConversion(1, "one");
	    expectConversion(2, "two");
	    expectConversion(3, "three");
	    expectConversion(4, "four");
	    expectConversion(5, "five");
	    expectConversion(6, "six");
	    expectConversion(7, "seven");
	    expectConversion(8, "eight");
	    expectConversion(9, "nine");
	  }
	@Test
	  public void convertsTenToNineteen() {
	    expectConversion(10, "ten");
	    expectConversion(11, "eleven");
	    expectConversion(12, "twelve");
	    expectConversion(13, "thirteen");
	    expectConversion(14, "fourteen");
	    expectConversion(15, "fifteen");
	    expectConversion(16, "sixteen");
	    expectConversion(17, "seventeen");
	    expectConversion(18, "eighteen");
	    expectConversion(19, "nineteen");
	  }

}
