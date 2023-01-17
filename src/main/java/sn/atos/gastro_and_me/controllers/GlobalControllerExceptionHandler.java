package sn.atos.gastro_and_me.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import sn.atos.gastro_and_me.exceptions.ResourceNotFoundException;

@RestControllerAdvice
public class GlobalControllerExceptionHandler {

    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    @ExceptionHandler(ResourceNotFoundException.class)
    public Error notFound(final ResourceNotFoundException e) {

        final Error error = new Error();
        error.setCode(HttpStatus.NOT_FOUND.value());
        error.setMessage(e.getMessage());

        return error;
    }

    class Error{
        private Integer code;
        private String message;

        public Integer getCode() {
            return code;
        }

        public void setCode(Integer code) {
            this.code = code;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
}
