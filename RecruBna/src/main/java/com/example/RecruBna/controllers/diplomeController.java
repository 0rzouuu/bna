package com.example.RecruBna.controllers;

import com.example.RecruBna.models.diplome;
import com.example.RecruBna.services.diplomeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/diplomes")
@CrossOrigin(origins = "http://localhost:4200")  // Enable CORS for Angular frontend
public class diplomeController {

    private final diplomeService service;

    public diplomeController(diplomeService service) {
        this.service = service;
    }

    @PostMapping
    public diplome save(@RequestBody diplome p) {
        return this.service.save(p);
    }

    @GetMapping
    public List<diplome> getAll() {
        return this.service.getAll();
    }

    @GetMapping("{id}")
    public diplome getById(@PathVariable int id) {
        return this.service.getById(id);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
        this.service.delete(id);
    }

    @PutMapping
    public diplome update(@RequestBody diplome d) {
        return this.service.update(d);
    }
}

//package com.example.RecruBna.controllers;
//import com.example.RecruBna.models.diplome;
//import com.example.RecruBna.services.diplomeService;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/diplomes")
//public class diplomeController implements diplomeService {
//    private final diplomeService service ;
//    public diplomeController(diplomeService service){
//        this.service=service;
//    }
//    @PostMapping
//    public diplome save(@RequestBody diplome p){
//        return this.service.save(p);
//    }
//    @GetMapping
//    public List<diplome> getAll(){
//
//        return this.service.getAll();
//    }
//    @GetMapping("{id}")
//    public diplome getById(@PathVariable int id){
//        return this.service.getById(id);
//    }
//
//    @DeleteMapping("{id}")
//    public void delete(@PathVariable int id){
//        this.service.delete(id);
//    }
//    @PutMapping
//    public diplome update(@RequestBody diplome d){
//
//        return this.service.update(d);
//    }
//}
