package com.Parcial1.ProyectoJPA.repositories;

import com.Parcial1.ProyectoJPA.entities.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends BaseRepository<Product, Long>{

}
