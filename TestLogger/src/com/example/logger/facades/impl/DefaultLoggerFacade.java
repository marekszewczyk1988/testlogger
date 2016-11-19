package com.example.logger.facades.impl;

import java.util.ArrayList;
import java.util.List;

import com.example.enums.Severity;
import com.example.logger.Logger;
import com.example.logger.exception.LoggingException;
import com.example.logger.facades.LoggerFacade;

public class DefaultLoggerFacade implements LoggerFacade {

	private List<Logger> loggers = new ArrayList<>();

	@Override
	public void log(final String message, final Severity severity) {
		for (final Logger logger : loggers) {
			try {
				logAsync(message, severity, logger);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private void logAsync(final String message, final Severity severity, final Logger logger) {
		new Runnable() {
			@Override
			public void run() {
				logger.log(message, severity);
			}
		};
	}
	
	@Override
	public void add(Logger logger) {
		loggers.add(logger);
	}

	protected List<Logger> getLoggers() {
		return loggers;
	}

}
