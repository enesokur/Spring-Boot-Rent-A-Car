package com.example.rentACar.dataAccess.abstracts;

import com.example.rentACar.entities.concrete.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BrandRepository extends JpaRepository<Brand,Integer> {
    public boolean existsByName(String name); // look for jpa keywords
}
