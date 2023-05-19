package com.example.rentACar.business.abstracts;

import com.example.rentACar.business.requests.CreateBrandRequest;
import com.example.rentACar.business.requests.UpdateBrandRequest;
import com.example.rentACar.business.responses.GetAllBrandsResponse;
import com.example.rentACar.business.responses.GetByIdBrandResponse;
import com.example.rentACar.entities.concrete.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BrandService{
    public List<GetAllBrandsResponse> getAll();
    public void add(CreateBrandRequest createBrandRequest);
    public GetByIdBrandResponse getById(int id);
    public void update(UpdateBrandRequest updateBrandRequest);
    public void delete(int id);
}
