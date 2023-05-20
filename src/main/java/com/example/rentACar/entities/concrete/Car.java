package com.example.rentACar.entities.concrete;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="cars")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name="plate")
    private String plate;

    @Column(name="dailyPrice")
    private double dailyPrice;

    @Column(name="modelYear")
    private int modelYear;

    // 1- available, 2-Rented, 3-maintenance
    @Column(name="state")
    private int state;

    @ManyToOne
    @JoinColumn(name="model_id")
    private Model model;

}
