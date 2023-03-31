package com.desarrollo.demospring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Homepage controller.
 */
@RestController
public class IndexController {

    @GetMapping("/index")
    String index() {
        return "index";
    }

}
