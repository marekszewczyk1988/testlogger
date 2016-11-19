package com.example;

import com.example.enums.Severity;
import com.example.logger.Logger;
import com.example.logger.impl.ConsoleLogger;
import com.example.logger.impl.FileLogger;

public class Start {

	public static void main(String[] args) {
		Logger logger = new ConsoleLogger();
		logger.log("abcd", Severity.LEVEL_0);

		
		Logger logger1 = new FileLogger();
		logger1.log("abcd", Severity.LEVEL_0);
	}

}
