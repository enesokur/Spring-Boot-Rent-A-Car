package com.example.rentACar.business.abstracts;

import com.example.rentACar.business.requests.CreateModelRequest;
import com.example.rentACar.business.responses.GetAllBrandsResponse;
import com.example.rentACar.business.responses.GetAllModelsResponse;

import java.util.List;

public interface ModelService {
    public List<GetAllModelsResponse> getAll();
    public void add(CreateModelRequest createModelRequest);

}
