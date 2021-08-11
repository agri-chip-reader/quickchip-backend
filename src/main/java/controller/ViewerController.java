package controller;

import business.ImagesService;
import data.dto.UserInsert;
import data.entities.Images;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/view")
public class ViewerController {

    @Autowired
    private ImagesService imagesService;

    @GetMapping
    public String home(){
        return "Hello Azure Changes!";
    }

    @GetMapping("/all")
    public List<String> getListImages(){
        return imagesService.getListImages();
    }

    @PostMapping("/add")
    public Images addImage(@RequestBody UserInsert userInsert){
        return imagesService.addImage(userInsert);
    }

    @GetMapping("/deleteAll")
    public void deleteAll(){
        imagesService.deleteImages();
    }
}
