package someshbose.github.io.liquibase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import someshbose.github.io.liquibase.model.Users;
import someshbose.github.io.liquibase.repository.UsersRespository;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {
    private UsersRespository repo;

    @Autowired
    public UsersController(UsersRespository repo){
        this.repo=repo;
    }

    @Cacheable("users-list")
    @GetMapping
    public ResponseEntity getUsers(){
        List<Users> users = (List<Users>) repo.findAll();
        return ResponseEntity.ok(users);
    }

    @PostMapping ResponseEntity postUser(@RequestBody Users user){
        repo.save(user);
        return ResponseEntity.ok(user);
    }

}
