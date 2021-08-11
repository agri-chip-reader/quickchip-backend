package controller;

import business.AdminService;
import data.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class HomeController {

    @Autowired
    private AdminService adminService;

    @GetMapping
    public String home(){
        return "Hello Azure Changes!";
    }

    @PostMapping("/addViewer")
    public User addUser(@RequestBody User user){
        return adminService.addUser(user);
    }

    @PostMapping("/login")
    public void login(@RequestBody User user){
        adminService.authorize(user);
    }


}
