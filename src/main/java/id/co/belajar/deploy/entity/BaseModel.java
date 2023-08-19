package id.co.belajar.deploy.entity;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@MappedSuperclass
public class BaseModel {
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
