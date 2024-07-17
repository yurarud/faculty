package com.example.faculty.controller;

import com.example.faculty.model.Publications;
import com.example.faculty.service.PublicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/publications")
public class PublicationController {
    @Autowired
    private PublicationService publicationService;

    @GetMapping
    public List<Publications> getAllPublications() {
        return publicationService.getAllPublications();
    }

    @GetMapping("/{id}")
    public Publications getPublicationById(@PathVariable Long id) {
        return publicationService.getPublicationById(id);
    }

    @PostMapping
    public Publications createPublication(@RequestBody Publications publications) {
        return publicationService.createPublication(publications);
    }

    @DeleteMapping("/{id}")
    public void deletePublication(@PathVariable Long id) {
        publicationService.deletePublication(id);
    }
}
