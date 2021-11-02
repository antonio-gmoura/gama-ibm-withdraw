package br.com.withdraw.config;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import br.com.withdraw.dto.ValidationDto;
import br.com.withdraw.factories.ValidationDtoFactory;

@RestControllerAdvice
public class ValidationHandler {
	
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public List<ValidationDto> handle(MethodArgumentNotValidException exception) {
		
		List<FieldError> errors = exception.getBindingResult().getFieldErrors();
		
		return errors.stream().map(ValidationDtoFactory::Create).collect(Collectors.toList());
		
	}
}
