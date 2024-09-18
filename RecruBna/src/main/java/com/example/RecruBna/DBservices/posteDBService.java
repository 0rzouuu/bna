package com.example.RecruBna.DBservices;

import com.example.RecruBna.models.poste;
import com.example.RecruBna.repositories.posteRepo;
import com.example.RecruBna.services.posteService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class posteDBService implements posteService {
    private final posteRepo repo ;
    public posteDBService(posteRepo repo){
        this.repo = repo;
    }


    @Override
    public poste save(poste p) {
        return this.repo.save(p);
    }

    @Override
    public List<poste> getAll() {
        return this.repo.findAll();
    }

    @Override
    public poste getById(int id) {
        return this.repo.findByidPoste(id);
    }

    @Override
    public void delete(int id) {
        this.repo.deleteById(id);
    }

    @Override
    public poste update(poste p) {
        poste existantposte = repo.getById(p.getIdPoste());
        existantposte.setNomPoste(p.getNomPoste());
        existantposte.setNbrPoste(p.getNbrPoste());
        return this.repo.saveAndFlush(existantposte);
    }

}
