package customannotationinjava;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention (RetentionPolicy.RUNTIME)
@Target (ElementType.TYPE)

public @interface CuustomAnnotation {
    public String name() default "Mr Jean";
    public String dateOfBirth(); 
}
