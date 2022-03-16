package com.example.demo.model.domain.api;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PersonResponse {

    @Schema(description = "Person first name", example = "John")
    private String firstName;
    @Schema(description = "Person last name", example = "Doe")
    private String lastName;
    @Schema(description = "Person email", example = "email@gmail.com")
    private String email;
    @Schema(description = "Person phone number", example = "+3701111111")
    private String phone;

}
