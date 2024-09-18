package com.example.RecruBna.services;

import com.example.RecruBna.models.diplome;

import java.util.List;

public interface diplomeService {

    public diplome save(diplome d);
    public List<diplome> getAll();
    public diplome getById(int id);
    public void delete(int id);
    public diplome update(diplome u);
}
