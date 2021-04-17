package someshbose.github.io.liquibase.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import someshbose.github.io.liquibase.model.Users;
import someshbose.github.io.liquibase.repository.UserRespository;

import java.util.List;

@RestController
public class Service {
    private UserRespository repo;

    @Autowired
    public Service(UserRespository repo){
        this.repo=repo;
    }

    @GetMapping
    public ResponseEntity getUsers(){
        List<Users> users = (List<Users>) repo.findAll();
        return ResponseEntity.ok(users);
    }

    @PostMapping ResponseEntity postUser(Users user){
        repo.save(user);
        return ResponseEntity.ok(user);
    }

}
