
package CustomAnnotationinJava;

import java.lang.Class;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Field;

public class CustomAnnotationinJava {
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
		
		for (Method method : object.getDeclaredMethods()) {
            if (method.isAnnotationPresent(CustomAnnotation.class)) {
                Annotation annotation = method.getAnnotation(CustomAnnotation.class);
                System.out.println(annotation);
            }
        }
    }
    
}
