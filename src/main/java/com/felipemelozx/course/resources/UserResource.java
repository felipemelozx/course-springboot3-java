package com.felipemelozx.course.resources;

import com.felipemelozx.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {


    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1, "Felipe", "felipe@gmail.com", "9999999", "1234578");
        return ResponseEntity.ok(u);
    }
}
