package com.kodilla.exception.nulllpointer;

public class MessageNotSentException extends Exception {

    public MessageNotSentException(final String message) {
        super(message);
    }
}
