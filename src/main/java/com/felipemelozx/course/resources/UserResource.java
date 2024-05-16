package com.felipemelozx.course.resources;

import com.felipemelozx.course.entities.User;
import com.felipemelozx.course.services.UserService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        List<User> userList = service.findAll();
        return  ResponseEntity.ok().body(userList);
    }

    @GetMapping (value = "/{id}")

    public ResponseEntity<User> findById(@PathVariable Long id){
        User user= service.findById(id);
        return  ResponseEntity.ok().body(user);
    }
}
