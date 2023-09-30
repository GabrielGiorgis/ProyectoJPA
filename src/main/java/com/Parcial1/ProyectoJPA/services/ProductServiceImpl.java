package com.Parcial1.ProyectoJPA.services;

import com.Parcial1.ProyectoJPA.entities.Product;
import com.Parcial1.ProyectoJPA.repositories.BaseRepository;
import com.Parcial1.ProyectoJPA.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends BaseServicesImpl<Product, Long> implements ProductServices{
    @Autowired
    private ProductRepository prodRepository;

    public ProductServiceImpl(BaseRepository<Product, Long> baseRepository, ProductRepository prodRepository) {
        super(baseRepository);
        this.prodRepository = prodRepository;
    }
}
