package laba.spring.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Enumerated(EnumType.STRING)
    @Column
    private ScienceRank scienceRank;
    @Enumerated(EnumType.STRING)
    @Column
    private Degree degree;
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "authors", cascade = CascadeType.REFRESH)
    private Set<Publication> publications;
    @ManyToOne(fetch=FetchType.EAGER)
    private Chair chair;
    @ManyToOne(fetch=FetchType.EAGER)
    private Direction direction;

    public int getCountOfPublication() {
        return this.publications.size();
    }

    public int getCountOfDegree() {
        return degree.getSeverity();
    }

    public int getCountOfRank() {
        return degree.getSeverity();
    }

}
