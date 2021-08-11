package data.repositories;

import data.entities.Images;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository <Images, String>{

}
