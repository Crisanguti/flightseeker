package com.flightapp.flightseeker.controllers;

import com.flightapp.flightseeker.entities.Origin;
import com.flightapp.flightseeker.repositories.OriginRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class OriginController {

	   //Logger method for warning and info messages
    private final Logger log = LoggerFactory.getLogger(OriginController.class);
	
    //Attribute
    private OriginRepository originRepository;

    //CRUD methods
    public OriginController(OriginRepository originRepository) {
        this.originRepository = originRepository;
    }

    //1. Getting origins, all at once and one by id
    @GetMapping ("/api/origins")
    public List<Origin> findAll() {
        return originRepository.findAll();
    }

    @GetMapping ("/api/origin/{id}")
    public ResponseEntity<Origin> findOneById(@PathVariable Long id) {
        Optional<Origin> originOptional = originRepository.findById(id);
        if(originOptional.isPresent())
            return ResponseEntity.ok(originOptional.get());
        else return ResponseEntity.notFound().build();
    }

    //2. Creating a new origin
    @PostMapping("/api/origins")
    public ResponseEntity<Origin> create (@RequestBody Origin Origin){
        if(Origin.getId() != null){
            log.warn("Trying to create an origin giving an id");
            return ResponseEntity.badRequest().build();
        }
        Origin result = originRepository.save(Origin);
        return ResponseEntity.ok(result);
    }
}


