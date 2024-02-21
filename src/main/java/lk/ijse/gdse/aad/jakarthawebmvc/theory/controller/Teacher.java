package lk.ijse.gdse.aad.jakarthawebmvc.theory.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teacher")
public class Teacher {
    @GetMapping
    void getTeachersData(){
        System.out.println("Get Teachers Data");
    }
    @PostMapping
    void jsutPostReq(){
        System.out.println("Just post req");
    }
//    @PostMapping("/{category}")
//    void pickVariable(@PathVariable ("category") String category){
//        System.out.println("Picked variable: "+category);
//    }
    @PostMapping("/{category}/{level}")
    void pickVariables(@PathVariable ("category") String category,@PathVariable ("level") int level){
        System.out.println("Picked variable: "+category +"and level is: "+level);
    }
    @PostMapping("/{reference:R\\d{4}}")
    void givenReference(@PathVariable ("reference") String reference){
        System.out.println("Reference is: "+reference);
    }
    @PostMapping(params = {"id","name"})
    void getParamDetails(@RequestParam("id") String id,@RequestParam("name") String name){
        System.out.println("Get Param Details: "+"name "+name +" id "+id);
    }
    @PostMapping(params = {"id"})
    String getParamDetailsOnlyId(@RequestParam("id") String id){
        System.out.println("Get Param Details: id "+id);
        return "Get Param Details: id "+id;
    }
    @PutMapping(params = {"id"})
    String checkTheValueStatus(@RequestParam("id") int id){
        return (id %2 == 0) ? "even":"odd";
    }
    @PutMapping(headers = "X-token" )
    String getDetailsFromHeaders(@RequestHeader ("X-token") String token){
        return token;
    }
}
