package id.co.belajar.deploy.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Entity
@Table (name = "course")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Course extends BaseModel {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    private String name;
    private Boolean certificate;
    private String thumbnail;
    private String type;
    private String status;
    private BigDecimal price;
    private String level;
    private String description;

    @OneToMany (mappedBy = "course")
    private List<Chapter> chapters;

    @OneToMany (mappedBy = "course")
    private List<ImageCourse> imageCourses;

    @OneToMany (mappedBy = "course")
    private List<MyCourse>myCourses;

    @OneToMany(mappedBy = "course")
    private List<Review>reviews;

    @ManyToOne
    private Mentor mentor;

}
