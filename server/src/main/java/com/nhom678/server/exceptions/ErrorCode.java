package com.nhom678.server.exceptions;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
@Getter
@AllArgsConstructor
public enum ErrorCode {
    INVALID_ID_KEY(1001, "Invalid Message key, you should check your key", HttpStatus.BAD_REQUEST), //Sai sot trong dat viec dat Message tai DTO
    ISBN_EXISTED(1002, "ISBN already existed", HttpStatus.CONFLICT),
    PUBLISHERNAME_EXISTED(1002, "Publisher Name already existed", HttpStatus.CONFLICT),
    CATEGORYNAME_EXISTED(1002, "Category Name already existed", HttpStatus.CONFLICT),
    AUTHOR_NAME_EXISTED(1002, "Author Name already existed", HttpStatus.CONFLICT),
    BOOK_NAME_EXISTED(1002, "Book Name already existed", HttpStatus.CONFLICT),
    CATEGORYNAME_NOT_FOUND(1003, "Category Name not found", HttpStatus.NOT_FOUND),
    CATEGORYID_NOT_FOUND(1003, "Category Id not found", HttpStatus.NOT_FOUND),
    AUTHOR_NOT_FOUND(1003, "Author name not found", HttpStatus.NOT_FOUND),
    ISBN_NOT_FOUND(1003, "ISBN not found", HttpStatus.NOT_FOUND),
    BOOK_ID_NOT_FOUND(1003, "Book id not found", HttpStatus.NOT_FOUND),
    BOOK_NAME_NOT_FOUND(1003, "Book name not found", HttpStatus.NOT_FOUND),
    BOOK_NOT_FOUND(1003, "Searched by Book name, ISBN - BOOK NOT FOUND", HttpStatus.NOT_FOUND),
    PUBLISHER_NOT_FOUND(1003, "Publisher name not found", HttpStatus.NOT_FOUND),
    ID_NOT_FOUND(1003, "Person not found", HttpStatus.NOT_FOUND),
    BOOK_IMAGE_URL_REQUIRED(1004, "Book image url is required", HttpStatus.BAD_REQUEST),
    AUTHOR_IDS_REQUIRED(1004, "Author ids is required", HttpStatus.BAD_REQUEST),
    AT_LEAST_ONE_AUTHOR_REQUIRED(1004, "At least one author is required", HttpStatus.BAD_REQUEST),
    BOOK_NAME_REQUIRED(1004, "Book name is required", HttpStatus.BAD_REQUEST),
    AUTHOR_NAME_REQUIRE(1004, "Author name is required", HttpStatus.BAD_REQUEST),
    PUBLICATION_DATE_REQUIRED(1004, "Publication date is required", HttpStatus.BAD_REQUEST),
    BOOK_NAME_TOO_SHORT(1004, "Book name must be at least 5 characters long", HttpStatus.BAD_REQUEST),
    ISBN_REQUIRED(1004, "ISBN is required", HttpStatus.BAD_REQUEST),
    CATEGORY_REQUIRED(1004, "Category is required", HttpStatus.BAD_REQUEST),
    QUANTITY_CANNOT_BE_NEGATIVE(1005, "Quantity cannot be negative", HttpStatus.BAD_REQUEST),
    INVALID_FORMAT_IMAGE_URL(1006, "Invalid format image url", HttpStatus.BAD_REQUEST),
    UNCATEGORIZED_EXCEPTION(6789, "Uncategorized Exception", HttpStatus.INTERNAL_SERVER_ERROR);

    private final int code;
    private final String message;
    private final HttpStatus status;
    
    public int getStatus() {
        return status.value();
    }
}
