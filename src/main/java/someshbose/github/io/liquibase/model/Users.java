package someshbose.github.io.liquibase.model;

import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "LQ_USERS")
@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Users {

    @Id
    @SequenceGenerator(name = "LQ_USERS_SEQ", sequenceName = "LQ_USERS_SEQ", allocationSize = 5)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LQ_USERS_SEQ")
    @Column(name ="id")
    Long id;

    @Column(name = "address")
    String address;

}
