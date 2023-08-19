package id.co.belajar.deploy.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "mentor")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Mentor extends BaseModel{
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    private String name;
    private String profile;
    private String email;
    private String profession;

    @OneToMany(mappedBy = "mentor")
    private List<Course>courses;
}
