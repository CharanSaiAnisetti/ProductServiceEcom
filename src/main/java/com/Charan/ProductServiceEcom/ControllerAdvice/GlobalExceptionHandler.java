package com.Charan.ProductServiceEcom.ControllerAdvice;

import com.Charan.ProductServiceEcom.Exceptions.ProductNotFoundException;
import com.Charan.ProductServiceEcom.dtos.ExceptionDto;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//@ControllerAdvice tells spring that this class contains some methods to handle the Exceptions
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<String> handleArithmeticException() {

        ResponseEntity<String> response = new ResponseEntity<>(
                "Something went wrong, please don't try to divide with zero," ,
                HttpStatus.NOT_FOUND);

        return response;
    }

    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<String> handleNullPointerException () {
        ResponseEntity<String> response = new ResponseEntity<>("Please enter a number which is in the valid rage 1 - 100",
                                                            HttpStatus.BAD_REQUEST);

        return response;
    }

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ExceptionDto> handleProductNotFoundException (ProductNotFoundException exception) {

        ExceptionDto exceptionDto = new ExceptionDto();
        exceptionDto.setErrorMessage(exception.getMessage());
        exceptionDto.setResolution(exception.getResolution());
        ResponseEntity<ExceptionDto> response= new ResponseEntity<>( exceptionDto, HttpStatus.NOT_FOUND);
        return response;
    }
}
