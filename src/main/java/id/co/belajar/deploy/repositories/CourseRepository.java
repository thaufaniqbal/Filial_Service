package id.co.belajar.deploy.repositories;

import id.co.belajar.deploy.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CourseRepository extends JpaRepository <Course, UUID> {
}
