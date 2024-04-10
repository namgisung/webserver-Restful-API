package io.project.rest.service.logic;

import io.project.rest.entity.User;
import io.project.rest.service.UserService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
@SpringBootTest
public class UserServiceLogicTest {

    @Autowired
    private UserService userService;

    private User kin;
    private User len;

    @BeforeEach
    public void startUp(){
        this.kin = new User("Kin","Kin@project.io");
        this.len = new User("Len","Len@project.io");
        this.userService.register(kin);
        this.userService.register(len);
    }

    @Test
    public void registerTest(){
        User sample = User.sample();

        assertThat(this.userService.register(sample)).isEqualTo(sample.getId());
        assertThat(this.userService.findAll().size()).isEqualTo(3);
        this.userService.remove(sample.getId());
    }

    @Test
    public void find(){

        assertThat(this.userService.find(len.getId())).isNotNull();
        assertThat(this.userService.find(len.getId()).getEmail()).isEqualTo(len.getEmail());
    }

    @AfterEach
    public void cleanUp(){
        this.userService.remove(kin.getId());
        this.userService.remove(len.getId());
    }

}
