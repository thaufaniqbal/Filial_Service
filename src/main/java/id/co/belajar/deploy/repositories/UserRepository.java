package id.co.belajar.deploy.repositories;

import id.co.belajar.deploy.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository <User, UUID> {
}
