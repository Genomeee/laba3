package laba.spring.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Publication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @ManyToMany
    @JoinTable(name = "publication_author",
            joinColumns = { @JoinColumn(name = "fk_publication") },
            inverseJoinColumns = { @JoinColumn(name = "fk_author") })
    private Set<User> authors;
}
