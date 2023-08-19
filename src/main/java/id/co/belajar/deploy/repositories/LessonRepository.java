package id.co.belajar.deploy.repositories;

import id.co.belajar.deploy.entity.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LessonRepository extends JpaRepository <Lesson, UUID> {
}
