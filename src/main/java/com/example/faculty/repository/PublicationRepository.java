package com.example.faculty.repository;


import com.example.faculty.model.Publications;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicationRepository extends JpaRepository<Publications, Long> {
}
