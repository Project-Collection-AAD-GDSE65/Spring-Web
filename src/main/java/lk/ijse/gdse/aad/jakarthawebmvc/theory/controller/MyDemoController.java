package lk.ijse.gdse.aad.jakarthawebmvc.theory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mycontroller")
public class MyDemoController extends ControllerRootAbstract{
    @Override
    @GetMapping
    void getData() {
        System.out.println("Hello");
    }
}
