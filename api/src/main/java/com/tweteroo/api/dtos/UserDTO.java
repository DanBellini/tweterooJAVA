package com.tweteroo.api.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserDTO {

    @NotBlank
    @Size(max = 100, message = "Maximum length for username is 50 characters!")
    private String username;

    @NotBlank(message = "Avatar cannot be empty!")
    private String avatar;

}
