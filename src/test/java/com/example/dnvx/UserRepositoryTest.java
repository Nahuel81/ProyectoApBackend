/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.dnvx;

import com.example.dnvx.Repository.UserRepo;
import com.example.dnvx.models.User;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.annotation.Rollback;

/**
 *
 * @author Usuario
 */
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserRepositoryTest {
    @Autowired
    UserRepo repo;
    
    @Test
    public void testCreateUser(){
    PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    String rawPassword ="admin";
    String encodePassword=passwordEncoder.encode(rawPassword);
    User newUser=new User("admin1@admin.com",encodePassword);
    User savedUser=repo.save(newUser);
    assertThat(savedUser).isNotNull();
    assertThat(savedUser.getId()).isGreaterThan(0);
    }
    
}
