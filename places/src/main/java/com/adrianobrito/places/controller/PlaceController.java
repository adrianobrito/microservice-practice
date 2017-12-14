package com.adrianobrito.places.controller;

import java.util.List;
import java.util.Random;

import com.adrianobrito.places.domain.Place;
import com.adrianobrito.places.repository.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("places")
public class PlaceController {

    private PlaceRepository placeRepository;
    private Random random;

    @Autowired
    public PlaceController(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
        this.random = new Random();
    }

    @GetMapping
    public List<Place> getPlaces() {
        return placeRepository.listPlaces();
    }

    @GetMapping("random")
    public Place getRandomPlace() {
        List<Place> places = placeRepository.listPlaces();
        return places.get(random.nextInt(places.size()));
    }

}
