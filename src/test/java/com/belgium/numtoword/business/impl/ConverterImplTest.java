package com.belgium.numtoword.business.impl;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.belgium.numtoword.business.exception.BusinessException;
@SpringBootTest
public class ConverterImplTest {

	@InjectMocks
	ConverterImpl converterImpl;
     
    
 
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
     
}
