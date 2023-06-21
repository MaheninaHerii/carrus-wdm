package fr.carrus.wdm.exceptions;

import lombok.Getter;

import java.util.List;

public class InvalidEntityException extends RuntimeException {
    public InvalidEntityException(String message) {
        super(message);
    }
    public InvalidEntityException(String message, Throwable cause) {
        super(message, cause);
    }
}
