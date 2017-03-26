package fr.ws.service;

import fr.ws.bean.Response;
import org.springframework.stereotype.Service;

@Service
public class HomeService {

    public Response getResponse() {
        return new Response("Test API");
    }
}
