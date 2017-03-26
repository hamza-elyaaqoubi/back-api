package fr.api.controller;

import fr.api.bean.Version;
import fr.api.service.ApiVersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/back-api")
@RestController
@CrossOrigin(maxAge = 1800)
public class ApiVersionController {

    @Autowired
    private ApiVersionService apiVersionService;

    @GetMapping(value = "/version", produces = "application/json")
    public Version getHomePage() {
        return apiVersionService.getVersion();
    }
}
