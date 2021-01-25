package com.udacity.CloudStorage.services;

import org.springframework.stereotype.Service;
import com.udacity.CloudStorage.mappers.UserMapper;
import com.udacity.CloudStorage.services.HashService;
import com.udacity.CloudStorage.models.User;
import com.udacity.CloudStorage.models.Note;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.security.SecureRandom;
import java.util.Base64;

@Service
public class UserService {
    private final UserMapper userMapper;
    private final HashService hashService;

    public UserService (UserMapper userMapper,HashService hashService){
        this.userMapper = userMapper;
        this.hashService = hashService;

    }

    public boolean isUsernameValid(String username){
        return userMapper.getUser(username) == null;
    }

    public User getUser(String username){
        return userMapper.getUser(username);
    }

    public int CreateUser(User user){
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16];
        random.nextBytes(salt);
        String encodedSalt = Base64.getEncoder().encodeToString(salt);
        String hashedPassword = hashService.getHashedValue(user.getPassword(), encodedSalt);
        //
        return userMapper.insert(new User(null, user.getUsername(), encodedSalt, hashedPassword, user.getFirstName(), user.getLastName()));
    }

    //public int createUser(User user){



    //}


}
