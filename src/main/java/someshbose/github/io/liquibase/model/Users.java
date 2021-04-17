package someshbose.github.io.liquibase.model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users {

    @Id
    Long id;

    @Column
    String address;

    public Users(String address){
        this.address=address;
    }
}
