package lk.ijse.gdse.aad.jakarthawebmvc.theory.controller;

import lk.ijse.gdse.aad.jakarthawebmvc.theory.model.StudentDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class Student {
    @GetMapping
    String healthTest(){
        return "Hello Student";
    }
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<StudentDTO> checkConsume(@RequestBody StudentDTO student){
        System.out.println(student);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(student);
    }


}
