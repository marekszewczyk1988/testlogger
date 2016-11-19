package com.example.logger.facades.impl;

import static java.util.Arrays.asList;
import static junit.framework.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import com.example.logger.Logger;
import com.example.logger.impl.FileLogger;

import junit.framework.Assert;

public class DefaultLoggerFacadeTest {
	
	private DefaultLoggerFacade facade;
	
	@Before
	public void setUp(){
		facade = new DefaultLoggerFacade();
	}
	
	
	@Test
	public void shouldAddLogger(){
		//given
		Logger logger = new FileLogger();
		
		//when
		facade.add(logger);
		
		//then
		assertEquals(asList(logger),facade.getLoggers());
	}

}
