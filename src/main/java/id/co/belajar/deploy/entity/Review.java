package id.co.belajar.deploy.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "review")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Review extends BaseModel{
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    private Double rating;
    private String note;

    @ManyToOne
    private User user;

    @ManyToOne
    private Course course;
}
