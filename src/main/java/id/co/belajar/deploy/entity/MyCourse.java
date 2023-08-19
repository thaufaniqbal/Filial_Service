package id.co.belajar.deploy.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "my_course")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MyCourse extends BaseModel{
    @Id
//    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private UUID id;

    @ManyToOne
    private Course course;

    @ManyToOne
    private User user;

}
