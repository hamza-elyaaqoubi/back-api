package fr.ws.controller;

import fr.ws.bean.Response;
import fr.ws.service.ChristinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChristinaController {

    @Autowired
    private ChristinaService christinaService;

    @GetMapping("/api-christina")
    public Response getAllUsers() {
        return christinaService.getResponse();
    }
}
