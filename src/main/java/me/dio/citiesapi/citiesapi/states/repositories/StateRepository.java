package me.dio.citiesapi.citiesapi.states.repositories;


import me.dio.citiesapi.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}