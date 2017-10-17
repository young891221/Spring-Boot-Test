package com.havi.controller;

import com.havi.domain.Book;
import com.havi.service.BookRestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookRestController {

    @Autowired
    private BookRestService bookRestService;

    @GetMapping(path = "/rest/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public Book VehicleDetailsJson() {
        return bookRestService.getRestBook();
    }
}
