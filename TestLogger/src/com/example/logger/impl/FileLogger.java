package com.example.logger.impl;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;

import com.example.enums.Severity;
import com.example.logger.Logger;
import com.example.logger.exception.LoggingException;

public class FileLogger implements Logger{

	@Override
	public void log(String message, Severity severity) {
		File logfile = new File("/tmp/logger");
		try {
			FileUtils.writeStringToFile(logfile,message+"\n", Charset.defaultCharset(), true);
		} catch (IOException e) {
			e.printStackTrace();
			throw new LoggingException(e);
		}
	}

}
