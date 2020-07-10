package com.example.Encryption;

import org.springframework.stereotype.Service;

@Service
public class TokenValidationService {

    //@Repository
    // TokenRepo tokenRepo;

    boolean tokenValidation(String uname,String pwd){
        boolean flag = true;
        String uuidToken = "";//tokenRepo.isTokenPresent();
        if(uuidToken == null){
            //throw new InvlaidToken();
            flag = false;
        }
        return flag;
    }

}
