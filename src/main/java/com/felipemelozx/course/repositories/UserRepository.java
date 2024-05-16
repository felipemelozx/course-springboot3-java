package com.felipemelozx.course.repositories;

import com.felipemelozx.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
