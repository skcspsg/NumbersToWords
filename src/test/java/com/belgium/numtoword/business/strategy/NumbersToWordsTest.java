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

}
