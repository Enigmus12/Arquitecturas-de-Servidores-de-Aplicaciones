package co.escuelaing.arep.microspringboot.examples;

import co.escuelaing.arep.microspringboot.httpServer.HttpServer;

/**
 *
 * @author Juan David Rodríguez
 */

public class WebApplication {
    public static void main(String[] args) throws Exception {
        HttpServer server = new HttpServer();

        // Serve static files from the "webroot/public" directory
        server.staticfiles("webroot/public");

        // Endpoint 1
        server.get("/hello", (req, res) -> {
            String name = req.getQueryParam("name");
            return "Hello " + (name != null ? name : "world");
        });

        // Endpoint 2
        server.get("/sum", (req, res) -> {
            int x = Integer.parseInt(req.getQueryParam("x"));
            int y = Integer.parseInt(req.getQueryParam("y"));
            return "Resultado: " + (x + y);
        });

        // Endpoint 3
        server.get("/pi", (req, resp) -> 
            String.valueOf(Math.PI)
        );

        // Start the server on port 8080
        server.start(8080);
    }
}
