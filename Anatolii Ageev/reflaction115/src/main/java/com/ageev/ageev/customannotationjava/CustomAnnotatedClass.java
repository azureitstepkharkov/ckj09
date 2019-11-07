package com.ageev.ageev.customannotationjava;

import java.lang.Class;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@CastomAnnotation(dateOfBirth = "1980-06-25")
public class CustomAnnotatedClass {
}
