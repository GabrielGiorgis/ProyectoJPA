package com.Parcial1.ProyectoJPA.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.annotations.NotFound;

import java.math.BigDecimal;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Rating extends Base{
    @NotNull
    @Column(name = "Rating", precision = 10, scale = 2)
    private BigDecimal rate;
    @Column(name = "Contador")
    private int count;
}
