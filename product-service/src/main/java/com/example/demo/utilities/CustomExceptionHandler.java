package com.example.demo.utilities;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import com.example.demo.utilities.*;

import com.example.demo.exceptions.CustomException;

@RestControllerAdvice
public class CustomExceptionHandler {
	
	@ExceptionHandler(value=CustomException.class)
	public ErrorMessage handleCustomException(Exception ex,WebRequest req) {
		return new ErrorMessage(ex.getMessage(),req.getDescription(false),LocalDateTime.now());
		
	}
	


	@ExceptionHandler(value=Exception.class)
	public ErrorMessage handleOtherException(Exception ex,WebRequest req) {
		return new ErrorMessage(ex.getMessage(),req.getDescription(false),LocalDateTime.now());
	}

}
