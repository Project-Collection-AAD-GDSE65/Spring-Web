package lk.ijse.gdse.aad.jakarthawebmvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teacher/**")
public class Teacher {
    @GetMapping
    void getTeachersData(){
        System.out.println("Get Teachers Data");
    }
}
