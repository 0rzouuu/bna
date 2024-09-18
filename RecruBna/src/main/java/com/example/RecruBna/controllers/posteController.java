package com.example.RecruBna.controllers;

import com.example.RecruBna.models.poste;
import com.example.RecruBna.services.posteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
@CrossOrigin(origins = "http://localhost:4200")  // Enable CORS for Angular frontend
public class posteController {

    private final posteService service;

    public posteController(posteService service) {
        this.service = service;
    }

    @PostMapping
    public poste save(@RequestBody poste p) {
        return this.service.save(p);
    }

    @GetMapping
    public List<poste> getAll() {
        return this.service.getAll();
    }

    @GetMapping("{id}")
    public poste getById(@PathVariable int id) {
        return this.service.getById(id);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
        this.service.delete(id);
    }

    @PutMapping
    public poste update(@RequestBody poste d) {
        return this.service.update(d);
    }
}


//package com.example.RecruBna.controllers;
//import com.example.RecruBna.models.poste;
//import com.example.RecruBna.services.posteService;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/posts")
//public class posteController implements posteService {
//    private final posteService service ;
//    public posteController(posteService service){
//        this.service=service;
//    }
//    @PostMapping
//    public poste save(@RequestBody poste p){
//        return this.service.save(p);
//    }
//    @GetMapping
//    public List<poste> getAll(){
//
//        return this.service.getAll();
//    }
//    @GetMapping("{id}")
//    public poste getById(@PathVariable int id){
//        return this.service.getById(id);
//    }
//
//    @DeleteMapping("{id}")
//    public void delete(@PathVariable int id){
//        this.service.delete(id);
//    }
//    @PutMapping
//    public poste update(@RequestBody poste d){
//
//        return this.service.update(d);
//    }
//}
