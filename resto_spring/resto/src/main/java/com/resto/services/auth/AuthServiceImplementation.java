package com.resto.services.auth;


import com.resto.dtos.SignupRequest;
import com.resto.dtos.UserDto;
import com.resto.entities.User;
import com.resto.enums.UserRole;
import com.resto.repositories.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImplementation implements AuthService{
    private final UserRepository userRepository;





    public AuthServiceImplementation(UserRepository userRepository) {
        this.userRepository = userRepository;

    }


    @Override
    public UserDto createUser(SignupRequest signupRequest) {
        User user = new User();
        user.setName(signupRequest.getName());
        user.setEmail(signupRequest.getName());
        user.setPassword(new BCryptPasswordEncoder().encode(signupRequest.getPassword()));
        user.setUserRole(UserRole.CUSTOMER);
        User createdUser = userRepository.save(user);
        UserDto createdUserDto = new UserDto();
        createdUserDto.setId(createdUser.getId());
        createdUserDto.setName(createdUser.getName());
        createdUserDto.setEmail(createdUser.getEmail());
        createdUserDto.setUserRole(createdUser.getUserRole());



        return createdUserDto;
    }
}
