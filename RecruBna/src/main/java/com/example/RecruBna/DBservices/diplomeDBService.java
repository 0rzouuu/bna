package com.example.RecruBna.DBservices;
import com.example.RecruBna.models.diplome;
import com.example.RecruBna.repositories.diplomeRepo;
import com.example.RecruBna.services.diplomeService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class diplomeDBService implements diplomeService {
    private final diplomeRepo repo ;
    public diplomeDBService(diplomeRepo repo){
        this.repo = repo;
    }

    @Override
    public diplome save(diplome d) {
        return this.repo.save(d);
    }

    @Override
    public List<diplome> getAll() {
        return this.repo.findAll();
    }

    @Override
    public diplome getById(int id) {
        return this.repo.findByIdDiplome(id);
    }

    @Override
    public void delete(int id) {
        this.repo.deleteById(id);
    }

    @Override
    public diplome update(diplome d) {
        diplome existantdiplome = repo.getById(d.getIdDiplome());
        existantdiplome.setNomDiplome(d.getNomDiplome());
        existantdiplome.setFac(d.getFac());

        return this.repo.saveAndFlush(existantdiplome);
    }

}
