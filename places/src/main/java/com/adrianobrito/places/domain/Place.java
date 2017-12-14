package com.adrianobrito.places.domain;

import lombok.Data;

@Data
public class Place {

    public Place(String name, String address, String city, String state) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
    }

    private final String name;
    private final String address;
    private final String city;
    private final String state;
    private GeoReference geoReference;

    public Place withCoordinates(double latitude, double longitude) {
        this.geoReference = new GeoReference(latitude, longitude);
        return this;
    }


}
