package com.example.RecruBna.services;

import com.example.RecruBna.models.candidature;

import java.util.List;

public interface candidatureService {

    public candidature save(candidature can);
    public List<candidature> getAll();
    public candidature getById(int id);
    public void delete(int id);
    public candidature update(candidature ucan);
}
