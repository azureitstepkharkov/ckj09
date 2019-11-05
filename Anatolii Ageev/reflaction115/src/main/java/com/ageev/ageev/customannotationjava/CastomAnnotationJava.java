package com.ageev.ageev.customannotationjava;

import java.lang.Class;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Field;


public class CastomAnnotationJava {

    public static void main(String[] args) {
        Class object = CustomAnnotatedClass.class;
        // Retrieve all annotations from the class
        Annotation[] annotations = object.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
        // Checks if an annotation is present
        if (object.isAnnotationPresent(CastomAnnotation.class)) {
            // Gets the desired annotation
            Annotation annotation = object.getAnnotation(CastomAnnotation.class);
            System.out.println(annotation);
        }
		/*
		for (Method method : object.getDeclaredMethods()) {
            if (method.isAnnotationPresent(CustomAnnotationMethod.class)) {
                Annotation annotation = method.getAnnotation(CustomAnnotationMethod.class);
                System.out.println(annotation);
            }
        }
        */
    }
}
