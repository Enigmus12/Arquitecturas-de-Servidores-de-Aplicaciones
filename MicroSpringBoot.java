/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package co.escuelaing.arep.microspringboot;

import co.escuelaing.arep.microspringboot.httpServer.HttpServer;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 *
 * @author maria.sanchez-m
 */
public class MicroSpringBoot {

    public static void main(String[] args) throws IOException, URISyntaxException {
        System.out.println("Starting MicroSpringBoot:");
        HttpServer.runServer(args);
    }
}
