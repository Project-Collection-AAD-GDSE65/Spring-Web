package lk.ijse.gdse.aad.jakarthawebmvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mycontroller")
public class MyDemoController{

    @GetMapping
    void getData() {
        System.out.println("Hello");
    }
}
