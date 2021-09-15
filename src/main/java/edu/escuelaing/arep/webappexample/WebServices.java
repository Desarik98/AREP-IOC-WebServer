package edu.escuelaing.arep.webappexample;

import edu.escuelaing.arep.nextspring.Component;
import edu.escuelaing.arep.nextspring.RequestMapping;

import java.time.LocalTime;

@Component
public class WebServices {

    @RequestMapping("/date")
    public static String date(String s){
        return LocalTime.now().toString();
    }
}
