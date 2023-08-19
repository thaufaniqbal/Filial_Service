package id.co.belajar.deploy.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "chapter")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Chapter extends BaseModel {
    @Id
    private UUID id;
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;

    @ManyToOne
    private Course course;

    @OneToMany(mappedBy = "chapter")
    private List<Lesson>lessons;
}
