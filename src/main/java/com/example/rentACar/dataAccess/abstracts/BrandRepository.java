package com.example.rentACar.dataAccess.abstracts;

import com.example.rentACar.entities.concrete.Brand;

import java.util.List;

public interface BrandRepository {
    public List<Brand> getAll();
}
