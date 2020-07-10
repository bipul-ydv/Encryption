package com.example.Encryption;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class TokenValidationService {

    //@Repository
    // TokenRepo tokenRepo;

    boolean tokenValidation(String uname,String pwd){
        boolean flag = true;
        String uuidToken = "";//tokenRepo.isTokenPresent();
        //check for time Expiry
        if(uuidToken == null){
            //throw new InvlaidToken();
            flag = false;
        }
        return flag;
    }

    String tokenRefresh(String uuid){
        boolean flag = true;
        String uuidToken = "";//tokenRepo.isTokenPresent();
        //check for time Expiry
        if(uuidToken == null){
            //throw new InvlaidToken();
            flag = false;
        }
        //insert a nerw token and return the same
        return UUID.randomUUID();
    }
}
