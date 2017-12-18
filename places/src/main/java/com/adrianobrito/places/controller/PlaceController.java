package com.adrianobrito.places.controller;

import java.util.List;
import java.util.Random;

import com.adrianobrito.places.domain.Place;
import com.adrianobrito.places.repository.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("places")
public class PlaceController {

    @Value("${places.message}")
    private String placesMessage;

    @Value("${message}")
    private String message;

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

    @GetMapping("message")
    public String getMessage() {
        return message;
    }

    @GetMapping("placesMessage")
    public String getPlacesMessage() {
        return placesMessage;
    }

}
