package com.ffem.api.controller;

import com.ffem.api.exception.FFEMException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Base Controller
 * Provides functionality for handling all request for FFEM
 */
@Controller
@RequestMapping(value = {"/**"},method = {RequestMethod.GET, RequestMethod.POST})
public class BaseController {

    public BaseController() {
    }

    @RequestMapping(
            value = {"/**"},
            produces = {"application/json"}
    )
    @GetMapping
    @PostMapping
    public String handleGetAll() throws FFEMException {
        throw new FFEMException("Activity resource not found");
    }
}
