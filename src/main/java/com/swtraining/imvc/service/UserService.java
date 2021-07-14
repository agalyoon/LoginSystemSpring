package com.swtraining.imvc.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.swtraining.imvc.model.User;
import com.swtraining.imvc.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
