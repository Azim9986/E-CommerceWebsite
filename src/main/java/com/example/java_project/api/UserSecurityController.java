package com.example.java_project.api;

import com.example.java_project.auth.AuthenticationRequest;
import com.example.java_project.auth.AuthenticationResponse;
import com.example.java_project.config.JwtUtility;
import com.example.java_project.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class UserSecurityController {
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    JwtUtility jwtUtility;
    @Autowired
    UserDetailsService userDetailsService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello User, Welcome!!";
    }

    @PostMapping("/{user}")
    public String hello(@PathVariable String user) {
        return "Hello, "+user+" , Welcome!!";
    }

//    @PostMapping("/authenticate")
//    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
//        try {
//            authenticationManager.authenticate(
//                    new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword())
//            );
//        } catch (BadCredentialsException ex) {
//            throw new Exception("Incorrect Username and Password", ex);
//        }
//        final UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getUsername());
//        final String jwt = jwtUtility.generateToken(String.valueOf(userDetails));
//        return ResponseEntity.ok(new AuthenticationResponse(jwt));
//    }


    @PostMapping("/authenticate")
    public String generateAuthToken(@RequestBody AuthenticationRequest authenticationRequest) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword())
        );
        return jwtUtility.generateToken(authenticationRequest.getUsername());
    }

}
