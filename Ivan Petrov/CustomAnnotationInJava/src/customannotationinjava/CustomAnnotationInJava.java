package customannotationinjava;

import java.lang.Class;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Field;

public class CustomAnnotationInJava {

    public static void main(String[] args) {
        Class object = CustomAnnotatedClass.class;
        // Retrieve all annotations from the class 
        Annotation[] annotations = object.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
        // Checks if an annotation is present 
        if (object.isAnnotationPresent(CustomAnnotation.class)) {
            // Gets the desired annotation 
            Annotation annotation = object.getAnnotation(CustomAnnotation.class);
            System.out.println(annotation);
        }
        // fetch the attributes of the annotation
/*        
for (Annotation annotation : annotations) {
            System.out.println("name: " + annotation.);
            System.out.println("Date of Birth: " + annotation.dateOfBirth());
        }
        */
// the same for all methods of the class 
/*        
for (Method method : object.getDeclaredMethods()) {
            if (method.isAnnotationPresent(CustomAnnotationMethod.class)) {
                Annotation annotation = method.getAnnotation(CustomAnnotationMethod.class);
                System.out.println(annotation);
            }
        }
        */
    }
    //
}
