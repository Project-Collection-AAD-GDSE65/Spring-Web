package lk.ijse.gdse.aad.jakarthawebmvc.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teacher")
public class Teacher {
    @GetMapping
    void getTeachersData(){
        System.out.println("Get Teachers Data");
    }
    @PostMapping("/{category}")
    void pickVariable(@PathVariable ("category") String category){
        System.out.println("Picked variable: "+category);
    }
    @PostMapping("/{category}/{level}")
    void pickVariables(@PathVariable ("category") String category,@PathVariable ("level") int level){
        System.out.println("Picked variable: "+category +"and level is: "+level);
    }
}
