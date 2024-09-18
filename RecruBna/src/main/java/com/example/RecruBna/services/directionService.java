package com.example.RecruBna.services;

import com.example.RecruBna.models.direction;

import java.util.List;

public interface directionService {

    public direction save(direction d);
    public List<direction> getAll();
    public direction getById(int Did);
    public void delete(int Did);
    public direction update(direction ud);
}
