package com.nerd.login_auth_api.repositories;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

public class UserRepository implements JpaRepository<User, Long> {

}
