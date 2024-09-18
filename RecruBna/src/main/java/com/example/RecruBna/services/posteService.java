package com.example.RecruBna.services;

import com.example.RecruBna.models.poste;import java.util.List;

public interface posteService {

    public poste save(poste p);
    public List<poste> getAll();
    public poste getById(int id);
    public void delete(int id);
    public poste update(poste d);
}
