package com.example.faculty.repository;

import com.example.faculty.model.DescriptionItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DescriptionItemRepository extends JpaRepository<DescriptionItem, Integer> {
    List<DescriptionItem> findByPageId(Integer pageId);
}
