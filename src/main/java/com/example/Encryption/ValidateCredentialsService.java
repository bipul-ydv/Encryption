package com.example.Encryption;

import org.springframework.stereotype.Service;

@Service
public class ValidateCredentialsService {

    //@Autowired
    //Repository tokenRepos;

    boolean validateCredentials(String uname,String pwd){
        boolean flag = false;
        String result = "";//tokenRepo.getByUnameAndPwd();
        if(result!=null) flag = true;
        return true;
    }

}
