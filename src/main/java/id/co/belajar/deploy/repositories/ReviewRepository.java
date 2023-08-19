package id.co.belajar.deploy.repositories;

import id.co.belajar.deploy.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ReviewRepository extends JpaRepository <Review, UUID> {
}
