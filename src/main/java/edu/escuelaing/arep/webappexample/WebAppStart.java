package edu.escuelaing.arep.webappexample;

import edu.escuelaing.arep.HttpServer;

import java.io.IOException;
import java.net.URISyntaxException;

public class WebAppStart {
    public static void main(String[] args) {
        try {
            HttpServer.getInstance().startServer(args);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
