package com.udacity.CloudStorage.services;

import com.udacity.CloudStorage.models.User;
import com.udacity.CloudStorage.models.UserCredential;
import com.udacity.CloudStorage.mappers.UserMapper;
import com.udacity.CloudStorage.mappers.CredentialMapper;
import org.springframework.stereotype.Service;
//// Manages User
@Service
public class CredentialService {
    private final UserMapper userMapper;
    private final CredentialMapper credentialMapper;


    public CredentialService(UserMapper userMapper, CredentialMapper credentialMapper){
        this.userMapper = userMapper;
        this.credentialMapper = credentialMapper;


    }


    public void addCredential(String username,String password,String URL){
        credentialMapper.insert(new UserCredential(0,URL,username,password,getUserID(username)));
    }


    public Integer getUserID(String username){
        User userToReturn = userMapper.getUser(username);
        return userToReturn.getUserID();
    }

    public UserCredential getCredential(Integer credentialID){
        return credentialMapper.getCredential(credentialID);
    }

    public void deleteCredential(Integer credentialID){
        credentialMapper.deleteCredential(credentialID);
    }

    public void updateCredential(Integer credentialID,String URL, String username,String password){
        credentialMapper.updateCredential(credentialID,username,URL,password);

    }

    public UserCredential[] getAllCredentials(Integer userCredentialID){
        return credentialMapper.getAllCredentials(userCredentialID);


    }

}
