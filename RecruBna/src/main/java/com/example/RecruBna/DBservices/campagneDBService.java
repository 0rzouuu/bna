package com.example.RecruBna.DBservices;

import com.example.RecruBna.models.campagne;
import com.example.RecruBna.repositories.campagneRepo;
import com.example.RecruBna.services.campagneService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class campagneDBService implements campagneService {
    private final campagneRepo repo ;
    public campagneDBService(campagneRepo repo){
        this.repo = repo;
    }


    @Override
    public campagne save(campagne c) {
        return this.repo.save(c);
    }

    @Override
    public List<campagne> getAll() {
        return this.repo.findAll();
    }

    @Override
    public campagne getByIdCampagne(int id)
    {
        return this.repo.findByIdCampagne(id);
    }
    @Override
    public void delete(int id) {

        this.repo.deleteById(id);
    }

    @Override
    public campagne update(campagne c) {
        campagne existantcampagne = repo.getById(c.getIdCampagne());
        existantcampagne.setDate_debut(c.getDate_debut());
        existantcampagne.setDate_fin(c.getDate_fin());
        existantcampagne.setNomLot(c.getNomLot());
        return this.repo.saveAndFlush(existantcampagne);
    }

}
