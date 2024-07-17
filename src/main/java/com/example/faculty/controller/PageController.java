package com.example.faculty.controller;

import com.example.faculty.model.Page;
import com.example.faculty.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {

    @Autowired
    private PageService pageService;

    @GetMapping("/page-info/{pageName}")
    public Page getPageInfo(@PathVariable String pageName) {
        return pageService.getPageInfo(pageName);
    }
}

