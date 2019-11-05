package com.ageev.ageev.customannotationjava;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface CastomAnnotation {
    public String name() default "Mr. Bean";
    public String dateOfBirth();
}
