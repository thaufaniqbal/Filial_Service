package id.co.belajar.deploy.repositories;

import id.co.belajar.deploy.entity.MyCourse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MyCourseRepository extends JpaRepository <MyCourse, UUID> {
}
