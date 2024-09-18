package com.example.RecruBna.controllers;
import com.example.RecruBna.models.campagne;
import com.example.RecruBna.services.campagneService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/campanies")
@CrossOrigin(origins = "http://localhost:4200")  // Allow Angular frontend to access this API
public class campagneController {

    private final campagneService service;
    public campagneController(campagneService service) {
        this.service = service;
    }

    @PostMapping
    public campagne save(@RequestBody campagne c) {
        return this.service.save(c);
    }

    @GetMapping
    public List<campagne> getAll() {
        return this.service.getAll();
    }

    @GetMapping("{id}")
    public campagne getById(@PathVariable int id) {
        return this.service.getByIdCampagne(id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable int id) {
        this.service.delete(id);
    }

    @PutMapping
    public campagne update(@RequestBody campagne u) {
        return this.service.update(u);
    }
}

//package com.example.RecruBna.controllers;
//
//
//import com.example.RecruBna.models.campagne;
//import com.example.RecruBna.services.campagneService;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/campanies")
//public class campagneController {
//    private final campagneService service ;
//    public campagneController(campagneService service){
//        this.service=service;
//    }
//    @PostMapping
//    public campagne save(@RequestBody campagne c){
//        return this.service.save(c);
//    }
//    @GetMapping
//    public List<campagne> getAll(){
//        return this.service.getAll();
//    }
//    @GetMapping("{id}")
//    public campagne getById(@PathVariable int id){
//        return this.service.getByIdCampagne(id);
//    }
//    @DeleteMapping("{id}")
//    public void deleteById(@PathVariable int id){
//        this.service.delete(id);
//    }
//    @PutMapping
//    public campagne update(@RequestBody campagne u){
//        return this.service.update(u);
//    }
//}
