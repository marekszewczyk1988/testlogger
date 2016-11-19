package com.example.logger;

import com.example.enums.Severity;

public interface Logger {
	
	void log (String message, Severity severity);

}
