package com.homework.task1.exception;

public class NotOldEnoughException extends Exception{
    public NotOldEnoughException() {
        super("The person is not old enough!");
    }
}
