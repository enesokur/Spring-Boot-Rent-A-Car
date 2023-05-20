package com.example.rentACar.business.rules;

import com.example.rentACar.core.utilities.exceptions.BusinessException;
import com.example.rentACar.dataAccess.abstracts.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandBusinessRules {
    private BrandRepository brandRepository;
    @Autowired
    public BrandBusinessRules(BrandRepository brandRepository){
        this.brandRepository = brandRepository;
    }

    public void checkIfExists(String name){
        if(this.brandRepository.existsByName(name)){
            throw new BusinessException("Brand name already exists!");
        }
    }
}
