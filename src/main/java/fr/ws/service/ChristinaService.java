package fr.ws.service;

import fr.ws.bean.Response;
import org.springframework.stereotype.Service;

@Service
public class ChristinaService {

    public Response getResponse() {
        return new Response(1, "TODO");
    }
}
