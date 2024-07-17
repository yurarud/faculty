package com.example.faculty.service;

import com.example.faculty.model.Publications;
import com.example.faculty.repository.PublicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicationService {
    @Autowired
    private PublicationRepository publicationRepository;

    public List<Publications> getAllPublications() {
        return publicationRepository.findAll();
    }

    public Publications getPublicationById(Long id) {
        return publicationRepository.findById(id).orElse(null);
    }

    public Publications createPublication(Publications publications) {
        return publicationRepository.save(publications);
    }

    public void deletePublication(Long id) {
        publicationRepository.deleteById(id);
    }


}

