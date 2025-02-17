package br.com.fiap.postech.customermanagement.application.exception.custom;

import br.com.fiap.postech.customermanagement.application.exception.ApiErrorResponse;
import br.com.fiap.postech.customermanagement.application.exception.ErrorType;
import org.springframework.http.HttpStatus;

/**
 * Exception thrown when a customer's email is blank.
 */
public class CustomerEmailCannotBeBlankException extends RuntimeException implements ApiErrorResponse {

    private static final ErrorType type = ErrorType.INVALID_JSON;
    private static final HttpStatus status = HttpStatus.NOT_ACCEPTABLE;

    /**
     * Constructs a new CustomerEmailCannotBeBlankException with a default message.
     */
    public CustomerEmailCannotBeBlankException() {
        super("Customer email cannot be blank!");
    }

    /**
     * Returns the type of error.
     *
     * @return the error type as a string
     */
    @Override
    public String getType() {
        return type.name();
    }

    /**
     * Returns the title of the error.
     *
     * @return the error title as a string
     */
    @Override
    public String getTitle() {
        return type.getTitle();
    }

    /**
     * Returns the HTTP status code for the error.
     *
     * @return the HTTP status code as an integer
     */
    @Override
    public int getStatus() {
        return status.value();
    }
}