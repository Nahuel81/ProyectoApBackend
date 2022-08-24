
package com.example.dnvx.security;


import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;

public class AuthRequest {
     @Email
    @Length(min=5, max=50)
    private String email;

    @Length(min=5, max=20)
    private String password;

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
