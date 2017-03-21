package fr.ws.bean;

public class Response {

    private int id;
    private String name;

    public Response() {
    }

    public Response(int id) {
        this.id = id;
    }

    public Response(int id, String name) {
        this(id);
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
