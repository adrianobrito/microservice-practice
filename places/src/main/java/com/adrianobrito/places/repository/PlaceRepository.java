package com.adrianobrito.places.repository;

import com.adrianobrito.places.domain.Place;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class PlaceRepository {

    private static final List<Place> PLACES = Arrays.asList(
        new Place("Gentilandia", "Rua 13 de Maio", "Fortaleza", "CE").withCoordinates(-3.740292,-38.4902483),
        new Place("Parque do Cóco", "Av Sebastião de Abreu", "Fortaleza", "CE").withCoordinates(-3.750734, -38.483426),
        new Place("iFactory", "Av Alberto Sá", "Fortaleza", "CE").withCoordinates(-3.741270, -38.486817),
        new Place("Praia de Iracema", "Av Alberto Sá", "Fortaleza", "CE").withCoordinates(-3.740292,-38.4902483),
        new Place("Dragão do Mar", "Av Alberto Sá", "Fortaleza", "CE").withCoordinates(-3.719796, -38.511362)
    );

    public List<Place> listPlaces() {
        return PLACES;
    }

}
