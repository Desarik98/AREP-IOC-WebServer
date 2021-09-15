package edu.escuelaing.arep.webappexample;

import edu.escuelaing.arep.nextspring.Component;
import edu.escuelaing.arep.nextspring.RequestMapping;

@Component
public class HelloController {
    @RequestMapping(value="/square")
    public static Double square(String n){
        Double number = Double.valueOf(n);
        return number * number;
    }

    @RequestMapping(value="/PI")
    public static Double Pi(){
        //Double number = Double.valueOf(n);
        return Math.PI;
    }

    @RequestMapping("/strlength")
    public static String length(String s){
        return "The length of the string is: "+ s.length();
    }
}
