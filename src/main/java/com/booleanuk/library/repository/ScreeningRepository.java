package com.booleanuk.library.repository;

import com.booleanuk.library.models.Movie;
import com.booleanuk.library.models.Screening;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScreeningRepository extends JpaRepository<Screening, Integer> {
    public List<Screening> getScreeningByMovie(Movie movie);
}
