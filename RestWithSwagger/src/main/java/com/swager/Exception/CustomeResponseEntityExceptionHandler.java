package com.swager.Exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class CustomeResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllException(Exceptionhandling ex, WebRequest request){
	
	ExceptionHandler eh=(ExceptionHandler) new Exceptionhandling(new Date(),ex.getMessage(),request.getDescription(false));
	
	return   new ResponseEntity<Object>(eh,HttpStatus.INTERNAL_SERVER_ERROR);
	
	 
	}
	
	@ExceptionHandler(UserNotFoundException.class)
	public final ResponseEntity<Object> userNotFoundException(Exceptionhandling ex, WebRequest request){
	
	ExceptionHandler eh=(ExceptionHandler) new Exceptionhandling(new Date(),ex.getMessage(),request.getDescription(false));
	
	return   new ResponseEntity<Object>(eh,HttpStatus.NOT_FOUND);
	
	 
	}
	
}
