package com.nhom678.server.exceptions;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
@Getter
@AllArgsConstructor
public enum ErrorCode {
    INVALID_ID_KEY(1001, "Invalid Message key, you should check your key", HttpStatus.BAD_REQUEST), //Sai sot trong dat viec dat Message tai DTO
    EMAIL_EXISTED(1002, "Email already existed", HttpStatus.CONFLICT),
    PHONE_EXISTED(1002, "Phone already existed", HttpStatus.CONFLICT),
    ID_EXISTED(1002, "Id already existed", HttpStatus.CONFLICT),
    STUDENT_NOT_FOUND(1003, "Student not found", HttpStatus.NOT_FOUND),
    ID_NOT_FOUND(1003, "Person not found", HttpStatus.NOT_FOUND),
    UNCATEGORIZED_EXCEPTION(6789, "Uncategorized Exception", HttpStatus.INTERNAL_SERVER_ERROR);

    private final int code;
    private final String message;
    private final HttpStatus status;
    
    public int getStatus() {
        return status.value();
    }
}
