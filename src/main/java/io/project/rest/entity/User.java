package io.project.rest.entity;

import com.google.gson.Gson;
import io.project.rest.TokenUtil;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Getter
@Setter
@ToString
public class User {

    private String id;
    private String name;
    private String email;
    private String token;


    public User() {
        this.id = UUID.randomUUID().toString();
        this.token = TokenUtil.generateToken(id);
    }

    public User(String name,String email){
        this();
        this.name = name;
        this.email = email;
    }


    public static User sample(){
        return new User("Park", "park@project.io");
    }

    public static void main(String[] args){
        User user = new User("gisung", "ddrbone@project.io");
        System.out.println(new Gson().toJson(user));

    }
}
