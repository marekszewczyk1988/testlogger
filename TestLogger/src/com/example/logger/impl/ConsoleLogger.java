package com.example.logger.impl;

import com.example.enums.Severity;
import com.example.logger.Logger;

public class ConsoleLogger implements Logger{

	@Override
	public void log(String message, Severity severity) {
		System.out.println(message);
	}

}
