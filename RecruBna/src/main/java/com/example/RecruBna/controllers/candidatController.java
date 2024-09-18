package com.example.RecruBna.controllers;
import com.example.RecruBna.models.candidat;
import com.example.RecruBna.services.candidatService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/candidats")
@CrossOrigin(origins = "http://localhost:4200")  // Enable CORS for the Angular frontend
public class candidatController {

    private final candidatService service;

    public candidatController(candidatService service) {
        this.service = service;
    }

    @PostMapping
    public candidat save(@RequestBody candidat ca) {
        return this.service.save(ca);
    }

    @GetMapping
    public List<candidat> getAll() {
        return this.service.getAll();
    }

    @GetMapping("{id}")
    public candidat getById(@PathVariable int id) {
        return this.service.getById(id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable int id) {
        this.service.delete(id);
    }

    @PutMapping
    public candidat update(@RequestBody candidat uca) {
        return this.service.update(uca);
    }
}

//package com.example.RecruBna.controllers;
//import com.example.RecruBna.models.candidat;
//import com.example.RecruBna.services.candidatService;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/candidats")
//public class candidatController {
//    private final candidatService service ;
//    public candidatController(candidatService service){
//        this.service=service;
//    }
//    @PostMapping
//    public candidat save(@RequestBody candidat ca){
//        return this.service.save(ca);
//    }
//    @GetMapping
//    public List<candidat> getAll(){
//        return this.service.getAll();
//    }
//    @GetMapping("{id}")
//    public candidat getById(@PathVariable int id){
//        return this.service.getById(id);
//    }
//    @DeleteMapping("{id}")
//    public void deleteById(@PathVariable int id){
//        this.service.delete(id);
//    }
//    @PutMapping
//    public candidat update(@RequestBody candidat uca){
//        return this.service.update(uca);
//    }
//}
