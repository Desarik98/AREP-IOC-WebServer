package edu.escuelaing.arep.webappexample;

import edu.escuelaing.arep.nextspring.GetMapping;

import java.time.LocalTime;

public class WebServices {

    @GetMapping("/date")
    public static String date(String s){
        return LocalTime.now().toString();
    }
}
