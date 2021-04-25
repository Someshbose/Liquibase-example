package someshbose.github.io.liquibase.model;

import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "users")
@Getter
@Setter
public class Users {

    @Id
    @SequenceGenerator(name = "USERS_SEQ", sequenceName = "USERS_SEQ", allocationSize = 5)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USERS_SEQ")
    @Column(name ="id")
    Long id;

    @Column(name = "address")
    String address;

}
