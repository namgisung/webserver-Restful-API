package io.project.rest.store;

import io.project.rest.entity.User;
import java.util.List;

public interface UserStore {
    String create(User newUser);
    void update(User newUser);
    void delete(String id);
    void deleteAll();

    User retrieve(String id);
    List<User> retrieveAll();
}
