package business;

import data.dto.UserInsert;
import data.entities.Images;
import data.repositories.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ImagesService {

    @Autowired
    private ImageRepository imagesRepository;

    public List<String> getListImages(){
        List<Images> imagesList =imagesRepository.findAll();
        List<String> paths = new ArrayList<>();
        for(Images image : imagesList){
            paths.add(image.getPath());
        }
        return paths;
    }

    public Images addImage(UserInsert userInsert){
        return imagesRepository.save(new Images(userInsert.getPath(),userInsert.getEmail()));
    }

    public void deleteImages(){
        imagesRepository.deleteAll();
    }
}
