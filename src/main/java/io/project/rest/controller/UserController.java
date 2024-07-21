package io.project.rest.controller;


import io.project.rest.TokenUtil;
import io.project.rest.entity.User;
import io.project.rest.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/users")
    public  String register(@RequestBody User newUser){
        return userService.register(newUser);
    }

    @GetMapping("/users/{token}")
    public ResponseEntity<?> find(@PathVariable String token) {
        String userId = TokenUtil.parseToken(token); 
        if (userId == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("토큰이 만료되었습니다.");
        }
        User user = userService.find(userId);
        return ResponseEntity.ok(user);
    }
    @GetMapping("/users")
    public List<User> findAll(){
        return userService.findAll();
    }

    @PutMapping("/users")
    public void modify(@RequestBody User newUser){
        userService.modify(newUser);
    }

    @DeleteMapping("/users/{token}")
    public void remove(@PathVariable String token){
        String userId = TokenUtil.parseToken(token); 
        System.out.println(userId);
        userService.remove(userId);
    }

    @DeleteMapping("/users")
    public void removeAll() {
        userService.deleteAllUsers();
    }

}
