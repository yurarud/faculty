package com.example.faculty.service;

import com.example.faculty.model.DescriptionItem;
import com.example.faculty.model.Page;
import com.example.faculty.repository.DescriptionItemRepository;
import com.example.faculty.repository.PageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PageService {

    @Autowired
    private PageRepository pageRepository;

    @Autowired
    private DescriptionItemRepository descriptionItemRepository;

    public Page getPageInfo(String pageName) {
        Page page = pageRepository.findByName(pageName);
        if (page != null) {
            List<DescriptionItem> descriptionItems = descriptionItemRepository.findByPageId(page.getId());
            page.setDescriptionItems(descriptionItems);
        }
        return page;
    }
}

