package com.manytomany.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pocs")
public class POCController {
	
	@Autowired
    private final POCRepository pocRepository;

    public POCController(POCRepository pocRepository) {
        this.pocRepository = pocRepository;
    }

    @GetMapping
    public List<POC> getAllPOCs() {
        return pocRepository.findAll();
    }
}
