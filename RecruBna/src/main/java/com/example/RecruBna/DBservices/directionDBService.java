package com.example.RecruBna.DBservices;

import com.example.RecruBna.models.direction;
import com.example.RecruBna.repositories.directionRepo;
import com.example.RecruBna.services.directionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class directionDBService implements directionService {
    private final directionRepo repo ;
    public directionDBService(directionRepo repo){
        this.repo = repo;
    }


    @Override
    public direction save(direction d) {
        return this.repo.save(d);
    }

    @Override
    public List<direction> getAll() {
        return this.repo.findAll();
    }

    @Override
    public direction getById(int id) {
        return this.repo.findByidDirection(id);
    }

    @Override
    public void delete(int id) {
        this.repo.deleteById(id);
    }

    @Override
    public direction update(direction d) {
        direction existantdirection = repo.getById(d.getIdDirection());
        existantdirection.setNbrDirection(d.getNbrDirection());
        existantdirection.setNomDirection(d.getNomDirection());
        return this.repo.saveAndFlush(existantdirection);
    }

}
