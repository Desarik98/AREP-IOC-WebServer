package edu.escuelaing.arep.webappexample;

import edu.escuelaing.arep.HttpServer;
import edu.escuelaing.arep.nextspring.Component;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WebAppStart {
    public static void main(String[] args) {
        try {
            HttpServer
                    .getInstance()
                    .startServer(getClassesWithComponentsAnnotation(new File("./src/main/java/" + WebAppStart.class.getPackage().getName().replace(".", "/"))));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    public static List<String> getClassesWithComponentsAnnotation(File file) {
        List<String> classesList = new ArrayList<>();
        if (file.isDirectory()) {
            for (File source : file.listFiles()) {
                classesList.addAll(getClassesWithComponentsAnnotation(source));
            }
        } else {
            if (file.getName().endsWith(".java")) {
                String[] paths = file.getPath().replace(".java", "").split("\\\\");
                String classFile = "";
                for (int i = 4; i < paths.length; i++) {
                    classFile += (i == paths.length - 1) ? paths[i] : paths[i] + ".";
                }
                try {
                    Class c = Class.forName(classFile);
                    if (c.isAnnotationPresent(Component.class)) {
                        classesList.add(classFile);
                    }
                } catch (ClassNotFoundException e) {
                    Logger.getLogger(WebAppStart.class.getName()).log(Level.SEVERE, "Component not found", e);
                }
            }
        }
        return classesList;
    }
}
