package com.felipemelozx.course.services.exception;

public class DatabaseException extends  RuntimeException {
        public DatabaseException(String msg){
            super(msg);
        }
}
