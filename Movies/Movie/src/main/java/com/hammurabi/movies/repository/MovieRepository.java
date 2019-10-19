package com.hammurabi.movies.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hammurabi.movies.model.Movie;

public interface MovieRepository extends JpaRepository<Long, Movie>{

}
