package com.ecole221.l3devweb.api.gateway.controller;



import com.ecole221.l3devweb.api.gateway.model.LoginRequest;
import com.ecole221.l3devweb.api.gateway.model.LoginResponse;
import com.ecole221.l3devweb.api.gateway.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LoginController {

    @Autowired
    LoginService loginService;

    @PostMapping("/users/login")
    public ResponseEntity<LoginResponse> login (@RequestBody LoginRequest loginRequest) throws Exception {
//        log.info("Executing login");

        ResponseEntity<LoginResponse> response = null;
        response = loginService.login(loginRequest);

        return response;
    }
}
