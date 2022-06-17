package com.homebrew.management.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import com.homebrew.management.dto.GetFormulaDetailsResponse;

@ControllerAdvice
public class ExceptionHandler {

	@org.springframework.web.bind.annotation.ExceptionHandler(FormulaNotFoundException.class)
	public ResponseEntity<GetFormulaDetailsResponse> handleFormulaNotFoundException(FormulaNotFoundException ex) {
		return new ResponseEntity<GetFormulaDetailsResponse>(new GetFormulaDetailsResponse(), HttpStatus.NOT_FOUND);
	}

	@org.springframework.web.bind.annotation.ExceptionHandler(BadRequestException.class)
	public ResponseEntity<GetFormulaDetailsResponse> handleUserNotFoundException(BadRequestException ex) {
		return new ResponseEntity<GetFormulaDetailsResponse>(new GetFormulaDetailsResponse(), HttpStatus.BAD_REQUEST);
	}

	@org.springframework.web.bind.annotation.ExceptionHandler(MissingServletRequestParameterException.class)
	public ResponseEntity<GetFormulaDetailsResponse> handleMissingServletRequestParameterException(
			MissingServletRequestParameterException ex) {
		return new ResponseEntity<GetFormulaDetailsResponse>(new GetFormulaDetailsResponse(), HttpStatus.BAD_REQUEST);
	}

	@org.springframework.web.bind.annotation.ExceptionHandler(HttpRequestMethodNotSupportedException.class)
	public ResponseEntity<GetFormulaDetailsResponse> handleMethodNotSupportedException(
			HttpRequestMethodNotSupportedException ex) {
		return new ResponseEntity<GetFormulaDetailsResponse>(new GetFormulaDetailsResponse(),
				HttpStatus.METHOD_NOT_ALLOWED);
	}

	@org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
	public ResponseEntity<GetFormulaDetailsResponse> handleExceptions(Exception ex) {
		return new ResponseEntity<GetFormulaDetailsResponse>(new GetFormulaDetailsResponse(),
				HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
