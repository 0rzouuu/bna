package com.example.RecruBna.services;

import com.example.RecruBna.models.candidat;

import java.util.List;

public interface candidatService {

    public candidat save(candidat ca);
    public List<candidat> getAll();
    public candidat getById(int id);
    public void delete(int id);
    public candidat update(candidat uca);
}
