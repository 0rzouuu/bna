package com.example.RecruBna.DBservices;
import com.example.RecruBna.exceptions.EtAuthException;
import com.example.RecruBna.models.candidat;
import com.example.RecruBna.repositories.candidatRepo;
import com.example.RecruBna.services.candidatService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class candidatDBService implements candidatService {
    private final candidatRepo repo ;
    public candidatDBService(candidatRepo repo){
        this.repo = repo;
    }


    @Override
    public candidat save(candidat c) throws EtAuthException {
        if (repo.countBycinCandidat(c.getCinCandidat()) > 0)
            throw new EtAuthException("cin already existed");
        return this.repo.save(c);
    }

    @Override
    public List<candidat> getAll() {
        return this.repo.findAll();
    }

    @Override
    public candidat getById(int id) {

        return this.repo.findByidCandidat(id);
    }

    @Override
    public void delete(int id) {

        this.repo.deleteById(id);
    }

    @Override
    public candidat update(candidat c) {
        candidat existantcandidat = repo.getById(c.getIdCandidat());
        existantcandidat.setNomCandidat(c.getNomCandidat());
        existantcandidat.setPrenomCandidat(c.getPrenomCandidat());
        return this.repo.saveAndFlush(existantcandidat);
    }

}
