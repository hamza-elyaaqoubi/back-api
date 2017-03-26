package fr.api.service;

import fr.api.bean.Response;
import org.springframework.stereotype.Service;

@Service
public class HomeService {

    public Response getResponse() {
        return new Response("Test API");
    }
}
