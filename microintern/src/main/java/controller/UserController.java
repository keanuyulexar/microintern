package controller;

import model.Role;
import model.User;
import repository.UserRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/user")

public class UserController {

    private final UserRepository userRepo;

    public UserController(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        user.setRole(Role.STUDENT);
        return userRepo.save(user);

    }

}
