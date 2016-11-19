package com.example.logger.factory;

import java.util.List;

import com.example.enums.LoggerType;
import com.example.logger.Logger;
import com.example.logger.facades.LoggerFacade;
import com.example.logger.facades.impl.DefaultLoggerFacade;
import com.example.logger.impl.ConsoleLogger;
import com.example.logger.impl.FileLogger;

public class LoggerFactory {

	public LoggerFacade create(List<LoggerType> types) {
		LoggerFacade facade = new DefaultLoggerFacade();
		for (LoggerType type : types) {
			facade.add(create(type));
		}
		return facade;

	}

	private Logger create(LoggerType type) {
		if (LoggerType.CONSOLE.equals(type)) {
			return new ConsoleLogger();
		} else if (LoggerType.FILE.equals(type)) {
			return new FileLogger();
		}
		throw new IllegalArgumentException();
	}

}
