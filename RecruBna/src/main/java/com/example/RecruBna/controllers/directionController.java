package com.example.RecruBna.controllers;

import com.example.RecruBna.models.direction;
import com.example.RecruBna.services.directionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/directions")
@CrossOrigin(origins = "http://localhost:4200")  // Enable CORS for Angular frontend
public class directionController {

    private final directionService service;

    public directionController(directionService service) {
        this.service = service;
    }

    @PostMapping
    public direction save(@RequestBody direction p) {
        return this.service.save(p);
    }

    @GetMapping
    public List<direction> getAll() {
        return this.service.getAll();
    }

    @GetMapping("{id}")
    public direction getById(@PathVariable int id) {
        return this.service.getById(id);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
        this.service.delete(id);
    }

    @PutMapping
    public direction update(@RequestBody direction d) {
        return this.service.update(d);
    }
}


//package com.example.RecruBna.controllers;
//import com.example.RecruBna.models.direction;
//import com.example.RecruBna.services.directionService;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/directions")
//public class directionController implements directionService {
//    private final directionService service ;
//    public directionController(directionService service){
//        this.service=service;
//    }
//    @PostMapping
//    public direction save(@RequestBody direction p){
//        return this.service.save(p);
//    }
//    @GetMapping
//    public List<direction> getAll(){
//
//        return this.service.getAll();
//    }
//    @GetMapping("{id}")
//    public direction getById(@PathVariable int id){
//        return this.service.getById(id);
//    }
//
//    @DeleteMapping("{id}")
//    public void delete(@PathVariable int id){
//        this.service.delete(id);
//    }
//    @PutMapping
//    public direction update(@RequestBody direction d){
//
//        return this.service.update(d);
//    }
//}
