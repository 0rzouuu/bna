package com.example.RecruBna.controllers;
import com.example.RecruBna.models.candidature;
import com.example.RecruBna.services.candidatureService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/candidatures")
@CrossOrigin(origins = "http://localhost:4200")  // Enable CORS for Angular frontend
public class candidatureController {

    private final candidatureService service;

    public candidatureController(candidatureService service) {
        this.service = service;
    }

    @PostMapping
    public candidature save(@RequestBody candidature p) {
        return this.service.save(p);
    }

    @GetMapping
    public List<candidature> getAll() {
        return this.service.getAll();
    }

    @GetMapping("{id}")
    public candidature getById(@PathVariable int id) {
        return this.service.getById(id);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
        this.service.delete(id);
    }

    @PutMapping
    public candidature update(@RequestBody candidature d) {
        return this.service.update(d);
    }
}


//package com.example.RecruBna.controllers;
//import com.example.RecruBna.models.candidature;
//import com.example.RecruBna.services.candidatureService;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/candidatures")
//public class candidatureController implements candidatureService {
//    private final candidatureService service ;
//    public candidatureController(candidatureService service){
//        this.service=service;
//    }
//    @PostMapping
//    public candidature save(@RequestBody candidature p){
//        return this.service.save(p);
//    }
//    @GetMapping
//    public List<candidature> getAll(){
//
//        return this.service.getAll();
//    }
//    @GetMapping("{id}")
//    public candidature getById(@PathVariable int id){
//        return this.service.getById(id);
//    }
//
//    @DeleteMapping("{id}")
//    public void delete(@PathVariable int id){
//        this.service.delete(id);
//    }
//    @PutMapping
//    public candidature update(@RequestBody candidature d){
//
//        return this.service.update(d);
//    }
//}

