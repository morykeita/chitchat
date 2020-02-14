package com.morykeita.userservice.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CreateUserRequest {

    @NotNull(message = "First name is required.")
    @Size(min = 3,max = 25)
    private String firstName;

    @NotNull(message = "Last name Name is required.")
    @Size(min = 3,max = 25)
    private String lastName;
    @Email
    private String email;
    @NotNull(message = "Password is required")
    @Size(min = 6, max = 25)
    private String password;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
