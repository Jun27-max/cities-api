package me.dio.citiesapi.citiesapi.countries.repositories;


import me.dio.citiesapi.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
