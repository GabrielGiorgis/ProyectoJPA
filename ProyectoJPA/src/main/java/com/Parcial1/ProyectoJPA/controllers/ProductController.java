package com.Parcial1.ProyectoJPA.controllers;

import com.Parcial1.ProyectoJPA.entities.Product;
import com.Parcial1.ProyectoJPA.services.ProductServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "storeapi.com/products")
public class ProductController extends BaseControllerImpl<Product, ProductServiceImpl>{
}
