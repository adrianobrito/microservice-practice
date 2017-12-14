package com.adrianobrito.places.domain;

import lombok.Data;

@Data
public class GeoReference {

    public GeoReference(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    private double latitude;
    private double longitude;

}
