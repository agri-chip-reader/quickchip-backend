package business;

import data.entities.Images;
import data.repositories.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ImagesServices {

    @Autowired
    private ImageRepository imagesRepository;

    public List<Images> getListImages(){
        return imagesRepository.findAll();
    }

    public Images addImage(){
        return imagesRepository.save(new Images("c://images","claudio"));
    }
}
