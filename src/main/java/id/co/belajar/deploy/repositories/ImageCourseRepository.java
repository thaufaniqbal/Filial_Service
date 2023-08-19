package id.co.belajar.deploy.repositories;

import id.co.belajar.deploy.entity.ImageCourse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ImageCourseRepository extends JpaRepository <ImageCourse, UUID> {
}
