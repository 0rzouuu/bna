package com.example.RecruBna.services;

import com.example.RecruBna.models.campagne;

import java.util.List;

public interface campagneService {

    public campagne save(campagne c);
    public List<campagne> getAll();
    public campagne getByIdCampagne(int id);
    public void delete(int id);
    public campagne update(campagne u);
}
