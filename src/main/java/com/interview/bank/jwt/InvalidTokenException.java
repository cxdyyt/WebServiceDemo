package com.interview.bank.jwt;

public class InvalidTokenException extends RuntimeException {

    private static final long serialVersionUID = -4155578352311203715L;

    public InvalidTokenException(String string) {
        super(string);
    }
}
