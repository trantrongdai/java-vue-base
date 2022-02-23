package com.cmc.exceptions;

import com.cmc.dto.RestResponse;
import com.cmc.enums.StatusCode;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MaxUploadSizeExceededException;

/**
 * Class to handle all exception before return to user site
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = ResourceNotFoundException.class)
    public ResponseEntity<RestResponse> handleResourceNotFoundException(ResourceNotFoundException exception) {

        RestResponse response = new RestResponse
                .RestResponseBuilder(StatusCode.FAILED.getValue(), null)
                .devMessage(exception.getMessage())
                .userMessage(exception.getMessage())
                .build();

        return new ResponseEntity(response, HttpStatus.OK);
    }

    @ExceptionHandler(value = BadRequestException.class)
    public ResponseEntity<RestResponse> handleBadRequestException(BadRequestException exception) {

        RestResponse response = new RestResponse
                .RestResponseBuilder(StatusCode.FAILED.getValue(), exception.getData())
                .devMessage(exception.getMessage())
                .userMessage(exception.getMessage())
                .build();

        return new ResponseEntity(response, HttpStatus.OK);
    }

    @ExceptionHandler(value = AppException.class)
    public ResponseEntity<RestResponse> handleAppException(AppException exception) {

        RestResponse response = new RestResponse
                .RestResponseBuilder(StatusCode.FAILED.getValue(), null)
                .devMessage(exception.getMessage())
                .userMessage(exception.getMessage())
                .build();

        return new ResponseEntity(response, HttpStatus.OK);
    }

    @ExceptionHandler(value = MaxUploadSizeExceededException.class)
    public ResponseEntity<RestResponse> handleMaxSizeException(MaxUploadSizeExceededException exc) {

        RestResponse response = new RestResponse
                .RestResponseBuilder(StatusCode.FAILED.getValue(), null)
                .devMessage(exc.getMessage())
                .userMessage(exc.getMessage())
                .build();
        return new ResponseEntity(response, HttpStatus.OK);
    }
}
