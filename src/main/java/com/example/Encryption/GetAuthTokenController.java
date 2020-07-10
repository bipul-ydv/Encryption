package com.example.Encryption;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetAuthTokenController {

    @Autowired
    GenerateTokenService generateTokenService;

    @Autowired
    ValidateCredentialsService validateCred;

    @Autowired
    TokenValidationService validateToken;

    @PostMapping(value = "/getToken")
    ResponseEntity getAuthToken(@RequestParam(value = "username")String username,@RequestParam(value = "password")String password ){
        boolean isValid = validateCred.validateCredentials(username,password);
        if(!isValid){
           // throw new Exception("Token Already Generated");
        }
        String token = generateTokenService.generateToken(username, password);
        return new ResponseEntity(token, HttpStatus.CREATED);
    }

    @GetMapping(value = "/validateToken")
    ResponseEntity validateToken(@RequestParam(value = "username")String username,@RequestParam(value = "password")String password ){
        boolean isValid = validateToken.tokenValidation(username, password);
        return new ResponseEntity(isValid,HttpStatus.FOUND);
    }

}
