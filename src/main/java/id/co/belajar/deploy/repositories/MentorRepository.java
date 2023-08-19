package id.co.belajar.deploy.repositories;

import id.co.belajar.deploy.entity.Mentor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MentorRepository extends JpaRepository <Mentor, UUID> {
}
