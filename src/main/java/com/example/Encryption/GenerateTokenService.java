package com.example.Encryption;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class GenerateTokenService {

    public String generateToken(String uname,String pwd){
        //check if token already generated in DB
        //save uname and pwd in db with UUID if new else fetch existing token
        //check if token has expired or not if expired throw Token Expired error
        //else return the token
        return UUID.randomUUID().toString();
    }
}
