package id.co.belajar.deploy.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "image_course")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ImageCourse extends BaseModel {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    private String image;

    @ManyToOne
    private Course course;
}
