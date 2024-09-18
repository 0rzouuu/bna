package com.example.RecruBna.DBservices;
import com.example.RecruBna.exceptions.EtAuthException;
import com.example.RecruBna.models.candidature;
import com.example.RecruBna.repositories.candidatureRepo;
import com.example.RecruBna.services.candidatureService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class candidatureDBService implements candidatureService {
    private final candidatureRepo repo ;
    public candidatureDBService(candidatureRepo repo){
        this.repo = repo;
    }


    @Override
    public candidature save(candidature c)throws EtAuthException {
        if (repo.countBycinCanda(c.getCinCanda()) > 0)
            throw new EtAuthException("cin already existed");
        return this.repo.save(c);
    }

    @Override
    public List<candidature> getAll() {
        return this.repo.findAll();
    }

    @Override
    public candidature getById(int id) {
        return this.repo.findByidCandidature(id);
    }

    @Override
    public void delete(int id) {
        this.repo.deleteById(id);
    }

    @Override
    public candidature update(candidature d) {
        candidature existantcandidature = repo.getById(d.getIdCandidature());
        existantcandidature.setAnciennetéProfessionnelle(d.getAnciennetéProfessionnelle());
        existantcandidature.setMoyenneGenBac(d.getMoyenneGenBac());
        existantcandidature.setMoyenneGenDiplome(d.getMoyenneGenDiplome());
        existantcandidature.setCinCanda(d.getCinCanda());
        existantcandidature.setDiplomeCanda(d.getDiplomeCanda());
        existantcandidature.setEmailCanda(d.getEmailCanda());
        existantcandidature.setNomCanda(d.getNomCanda());
        existantcandidature.setPrenomCanda(d.getPrenomCanda());
        existantcandidature.setTelCanda(d.getTelCanda());
        existantcandidature.setDateNaissCanda(d.getDateNaissCanda());
        existantcandidature.setDateDiplomeCanda(d.getDateDiplomeCanda());



        return this.repo.saveAndFlush(existantcandidature);
    }

}
