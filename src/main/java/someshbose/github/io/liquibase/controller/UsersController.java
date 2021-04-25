package someshbose.github.io.liquibase.controller;

import Someshbose.github.io.liquibase.api.UsersApi;
import Someshbose.github.io.liquibase.dao.UserDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import someshbose.github.io.liquibase.model.Users;
import someshbose.github.io.liquibase.repository.UsersRespository;
import java.util.List;

@RestController
public class UsersController implements UsersApi {
    private UsersRespository repo;
    private ModelMapper modelMapper;

    @Autowired
    public UsersController(UsersRespository repo,ModelMapper modelMapper){
        this.repo=repo;
        this.modelMapper=modelMapper;
    }

    @Override
    public ResponseEntity<UserDto> addUser(UserDto userDto) {
        return null;
    }

    @Override
    public ResponseEntity<List<UserDto>> getUsers() {
        return null;
    }

    private UserDto convertToDto(Users user) {
        UserDto userDto = modelMapper.map(user, UserDto.class);
        return userDto;
    }

    private Users convertToEntity(UserDto userDto) {
        Users user = modelMapper.map(userDto, Users.class);
        return user;
    }

}
