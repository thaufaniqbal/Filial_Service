package id.co.belajar.deploy.repositories;

import id.co.belajar.deploy.entity.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ChapterRepository  extends JpaRepository <Chapter, UUID> {
}
