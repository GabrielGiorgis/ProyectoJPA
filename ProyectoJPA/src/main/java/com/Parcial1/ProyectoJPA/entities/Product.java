package com.Parcial1.ProyectoJPA.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

import java.math.BigDecimal;

@Entity

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product extends Base{

    @NotNull
    @Column(name = "Precio_Compra", precision = 10, scale = 2)
    private BigDecimal price;
    @Column(name = "Descripción")
    private String description;
    @Column(name = "Categoría")
    private String category;
    @Column(name = "url_Imagen")
    private String image;
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "rating_id")
    private Rating rating;
}
