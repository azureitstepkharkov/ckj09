
package CustomAnnotationinJava;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention (RetentionPolicy.RUNTIME)
@Target (ElementType.TYPE)
public @interface CustomAnnotation
{
    public String name() default "Mr Bean";
    public String dateOfBirth();
    
}

