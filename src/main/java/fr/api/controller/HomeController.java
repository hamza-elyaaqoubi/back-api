package fr.api.controller;

import fr.api.bean.Response;
import fr.api.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/back-api")
@RestController
public class HomeController {

    @Autowired
    private HomeService homeService;

    @GetMapping(value = "/home", produces = "application/json")
    public Response getHomePage() {
        return homeService.getResponse();
    }
}
