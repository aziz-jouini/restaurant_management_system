package com.resto.services.auth;

import com.resto.dtos.SignupRequest;
import com.resto.dtos.UserDto;

public interface AuthService {
    UserDto createUser(SignupRequest signupRequest);
}
