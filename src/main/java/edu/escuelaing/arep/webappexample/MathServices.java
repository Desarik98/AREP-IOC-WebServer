package edu.escuelaing.arep.webappexample;

import edu.escuelaing.arep.nextspring.GetMapping;

public class MathServices {
    @GetMapping(value="/square")
    public static Double square(String n){
        Double number = Double.valueOf(n);
        return number * number;
    }

    @GetMapping(value="/PI")
    public static Double Pi(){
        //Double number = Double.valueOf(n);
        return Math.PI;
    }

    @GetMapping("/strlength")
    public static String length(String s){
        return "The length of the string is: "+ s.length();
    }
}
