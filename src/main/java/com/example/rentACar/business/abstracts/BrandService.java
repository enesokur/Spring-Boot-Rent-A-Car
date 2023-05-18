package com.example.rentACar.business.abstracts;

import com.example.rentACar.entities.concrete.Brand;

import java.util.List;

public interface BrandService {
    public List<Brand> getAll();
}
