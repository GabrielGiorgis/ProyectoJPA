package com.Parcial1.ProyectoJPA.repositories;

import com.Parcial1.ProyectoJPA.entities.Rating;
import org.springframework.stereotype.Repository;

@Repository
public interface RatingRepository extends BaseRepository<Rating, Long> {
}
