package controller;

import business.ImagesServices;
import data.entities.Images;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/view")
public class ViewerController {

    @Autowired
    private ImagesServices imagesServices;

    @GetMapping
    public String home(){
        return "Hello Azure Changes!";
    }

    @GetMapping("/all")
    public List<Images> getListImages(){
        return imagesServices.getListImages();
    }

    @GetMapping("/add")
    public Images addImage(){
        return imagesServices.addImage();
    }
}
