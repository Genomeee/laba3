package laba.spring.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Direction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "direction",cascade = CascadeType.REMOVE)
    private Set<User> users;
}
