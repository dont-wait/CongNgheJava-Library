package com.nhom678.server.dto.request.lecture;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class LecturerCreateRequest {
    @Size(min = 1, message = "ID_EXISTED")            
    String lecturerId;

    String firstName;
    String lastName;

    @Email
    @Size(min = 10, message = "EMAIL_EXISTED")
    String email;

    @Size(min = 9, message = "PHONE_EXISTED")
    String phone;
}
