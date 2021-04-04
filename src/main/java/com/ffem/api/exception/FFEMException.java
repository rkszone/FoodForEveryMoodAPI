package com.ffem.api.exception;

/**
 * FFEM Exception when something is wrong in API
 */
public class FFEMException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor FFEMException
     * @param message the message of the error
     */
    public FFEMException(String message) {
        super(message);
    }
}
