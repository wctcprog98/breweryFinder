package com.techelevator.dao;

import com.techelevator.Exceptions.BeerNotFoundException;
import com.techelevator.model.Beer;

import java.util.List;

public interface BeerDAO {

    void create(Beer beer);
    List<Beer> findAll();
    Beer findById(Long id) throws BeerNotFoundException;
    void updateBeer(Beer beer, Long id) throws BeerNotFoundException;
    void deactivateBeer(Long id) throws BeerNotFoundException;
}