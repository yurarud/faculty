package com.example.faculty.repository;

import com.example.faculty.model.PublicationCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublicationCategoryRepository extends JpaRepository<PublicationCategory, Long> {
}
