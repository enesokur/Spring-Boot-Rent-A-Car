package com.example.rentACar.webApi.controlles;

import com.example.rentACar.business.abstracts.ModelService;
import com.example.rentACar.business.requests.CreateBrandRequest;
import com.example.rentACar.business.requests.CreateModelRequest;
import com.example.rentACar.business.responses.GetAllModelsResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/api/models")
public class ModelsController {
    private ModelService modelService;
    @Autowired
    public ModelsController(ModelService modelService){
        this.modelService = modelService;
    }
    @GetMapping()
    public List<GetAllModelsResponse> getAll(){
        return modelService.getAll();
    }

    @PostMapping()
    @ResponseStatus(code= HttpStatus.CREATED)
    public void add(@RequestBody @Valid CreateModelRequest createModelRequest){
        modelService.add(createModelRequest);
    }
}
